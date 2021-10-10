package com.maxshkodin.spring.service.impl;

import com.maxshkodin.spring.model.Doctor;
import com.maxshkodin.spring.repository.DoctorRepository;
import com.maxshkodin.spring.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Component
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private  DoctorRepository doctorRepository;

    @Override
    public void add(Doctor doctor) {
        doctorRepository.add(doctor);
    }

    @Override
    public void delete(Doctor doctor) {
        doctorRepository.delete(doctor);
    }

    @Override
    public void update(Doctor doctor) {
        doctorRepository.update(doctor);
    }

    @Override
    public Doctor getById(int id) {
        return doctorRepository.getById(id);
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.getAll();
    }
}
