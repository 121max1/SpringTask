package com.maxshkodin.spring.service.impl;

import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.model.Doctor;
import com.maxshkodin.spring.model.Record;
import com.maxshkodin.spring.model.Speciality;
import com.maxshkodin.spring.repository.RecordRepository;
import com.maxshkodin.spring.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class RecordServiceImpl implements RecordService {

    @Autowired
    private  RecordRepository recordRepository;

    @Override
    public List<GregorianCalendar> GetFreeGapsByDoctorOnDay(Doctor doctor, GregorianCalendar date) {
        List<GregorianCalendar> allGapsByDay = new ArrayList<GregorianCalendar>();
        for(int currentHour = 9; currentHour<21;currentHour++){
            GregorianCalendar dateToAdd = new GregorianCalendar();
            dateToAdd.set(date.get(GregorianCalendar.YEAR),
                    date.get(GregorianCalendar.MONTH),
                    date.get(GregorianCalendar.DAY_OF_MONTH),currentHour,0);
            allGapsByDay.add(dateToAdd);
        }
        List<Record> recordsByDoctorOnDay = recordRepository.getRecordsByDoctor(doctor).
                stream().
                filter(record -> record.getRecordDateTime().get(GregorianCalendar.DATE) == date.get(GregorianCalendar.DATE)).
                collect(Collectors.toList());
        for (Record record: recordsByDoctorOnDay) {
            allGapsByDay.remove(record.getRecordDateTime());
        }
        return  allGapsByDay;
    }

    @Override
    public List<GregorianCalendar> GetFreeGapsByDoctorOnWeek(Doctor doctor, GregorianCalendar dateFrom) {
        List<GregorianCalendar> allGapsByDay = new ArrayList<GregorianCalendar>();
        GregorianCalendar maxDate = new GregorianCalendar(dateFrom.get(GregorianCalendar.YEAR),
                dateFrom.get(GregorianCalendar.MONTH),
                dateFrom.get(GregorianCalendar.DAY_OF_MONTH)+7);
        List<Record> recordsByDoctorOnWeek = recordRepository.getRecordsByDoctor(doctor).
                stream().
                filter(record -> record.getRecordDateTime().get(GregorianCalendar.DATE) >= dateFrom.get(GregorianCalendar.DATE)
                        && record.getRecordDateTime().get(GregorianCalendar.DATE) <= maxDate.get(GregorianCalendar.DATE)).collect(Collectors.toList());
        for (int i = 0; i < 7; i++) {
            for (int currentHour = 9; currentHour < 21; currentHour++) {
                GregorianCalendar dateToAdd = new GregorianCalendar();
                dateToAdd.set(dateFrom.get(GregorianCalendar.YEAR),
                        dateFrom.get(GregorianCalendar.MONTH),
                        dateFrom.get(GregorianCalendar.DAY_OF_MONTH), currentHour, 0);
                allGapsByDay.add(dateToAdd);
                dateFrom.add(GregorianCalendar.DAY_OF_MONTH,1);
            }
        }
        for (Record record: recordsByDoctorOnWeek) {
            allGapsByDay.remove(record.getRecordDateTime());
        }
        return  allGapsByDay;
    }

    @Override
    public Map<Doctor,List<GregorianCalendar>> GetFreeGapsByDoctorTypeOnDay(Speciality speciality, GregorianCalendar date) {
        List<Record> allRecords = recordRepository.getAll();
        Map<Doctor,List<GregorianCalendar>> toReturn = new HashMap<Doctor,List<GregorianCalendar>>();
        for (Record record: allRecords) {
            if(record.getDoctor().getSpeciality() == speciality) {
                toReturn.put(record.getDoctor(), GetFreeGapsByDoctorOnDay(record.getDoctor(),date));
            }
        }
        return toReturn;
    }

    @Override
    public Map<Doctor,List<GregorianCalendar>> GetFreeGapsByDoctorTypeOnWeek(Speciality speciality, GregorianCalendar dateFrom) {
        List<Record> allRecords = recordRepository.getAll();
        Map<Doctor,List<GregorianCalendar>> toReturn = new HashMap<Doctor,List<GregorianCalendar>>();
        for (Record record: allRecords) {
            if(record.getDoctor().getSpeciality() == speciality) {
                toReturn.put(record.getDoctor(), GetFreeGapsByDoctorOnWeek(record.getDoctor(),dateFrom));
            }
        }
        return toReturn;
    }

    @Override
    public List<Record> GetFutureRecordsByClient(Client client) {
        return recordRepository.getFutureRecords();
    }

    @Override
    public void add(Record record) {
        recordRepository.add(record);
    }

    @Override
    public void delete(Record record) {
        recordRepository.delete(record);
    }

    @Override
    public List<Record> getRecordsByClient(Client client) {
        return recordRepository.getRecordsByClient(client);
    }
}
