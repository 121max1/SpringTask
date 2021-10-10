package com.maxshkodin.spring.repository.fake_impl;


import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.model.Doctor;
import com.maxshkodin.spring.repository.DoctorRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DoctorRepositoryFakeImpl implements DoctorRepository {

    private final List<Doctor> doctorList;

    public DoctorRepositoryFakeImpl(){
       doctorList = new ArrayList<Doctor>();
    }

    @Override
    public void add(Doctor doctor) {
        doctorList.add(doctor);
    }

    @Override
    public void delete(Doctor doctor) {
        doctorList.remove(doctor);
    }

    @Override
    public void update(Doctor doctor) {
        Doctor doctorToDelete = doctorList.stream().filter(d -> d.getId() == doctor.getId()).collect(Collectors.toList()).get(0);
        doctorList.remove(doctorToDelete);
        doctorList.add(doctor);
    }

    @Override
    public List<Doctor> getAll() {
        return doctorList;
    }

    @Override
    public Doctor getById(int id) {
        return doctorList.stream().filter(d -> d.getId() == id).collect(Collectors.toList()).get(0);
    }
}
