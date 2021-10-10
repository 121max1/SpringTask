package com.maxshkodin.spring.repository;

import com.maxshkodin.spring.model.Doctor;

import java.util.List;

public interface DoctorRepository {

    void add(Doctor doctor);

    void delete(Doctor doctor);

    void update(Doctor doctor);

    List<Doctor> getAll();

    Doctor getById(int id);

}
