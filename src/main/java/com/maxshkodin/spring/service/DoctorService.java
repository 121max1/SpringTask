package com.maxshkodin.spring.service;

import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.model.Doctor;

import java.util.List;

public interface DoctorService {

    void add(Doctor doctor);

    void delete(Doctor doctor);

    void update(Doctor doctor);

    Doctor getById(int id);

    List<Doctor> getAll();
}
