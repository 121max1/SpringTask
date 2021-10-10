package com.maxshkodin.spring.service.impl;

import com.maxshkodin.spring.model.Appointment;
import com.maxshkodin.spring.model.Record;
import com.maxshkodin.spring.repository.AppointmentRepository;
import com.maxshkodin.spring.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void add(Appointment appointment) {
        appointmentRepository.add(appointment);
    }

}
