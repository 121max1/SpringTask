package com.maxshkodin.spring.repository.fake_impl;

import com.maxshkodin.spring.model.Appointment;
import com.maxshkodin.spring.model.Record;
import com.maxshkodin.spring.repository.AppointmentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppointmentRepositoryFakeImpl implements AppointmentRepository {
    private List<Appointment> appointmentList;

    public AppointmentRepositoryFakeImpl(){
        appointmentList = new ArrayList<Appointment>();
    }


    @Override
    public void add(Appointment appointment) {
        appointmentList.add(appointment);
    }

}
