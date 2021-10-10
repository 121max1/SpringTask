package com.maxshkodin.spring.service;

import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.model.Doctor;
import com.maxshkodin.spring.model.Record;
import com.maxshkodin.spring.model.Speciality;

import java.util.Dictionary;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

public interface RecordService {

    List<GregorianCalendar> GetFreeGapsByDoctorOnDay(Doctor doctor, GregorianCalendar date);

    List<GregorianCalendar> GetFreeGapsByDoctorOnWeek(Doctor doctor, GregorianCalendar dateFrom);

    Map<Doctor,List<GregorianCalendar>> GetFreeGapsByDoctorTypeOnDay(Speciality speciality, GregorianCalendar date);

    Map<Doctor,List<GregorianCalendar>> GetFreeGapsByDoctorTypeOnWeek(Speciality speciality, GregorianCalendar dateFrom);

    List<Record> GetFutureRecordsByClient(Client client);

    void add(Record record);

    void delete(Record record);

    List<Record> getRecordsByClient(Client client);

}
