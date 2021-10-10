package com.maxshkodin.spring.repository;

import com.maxshkodin.spring.model.Appointment;
import com.maxshkodin.spring.model.Record;

public interface AppointmentRepository {

    void add(Appointment appointment);
}
