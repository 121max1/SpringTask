package com.maxshkodin.spring.model;

import java.util.GregorianCalendar;

public class Record {

    private Doctor doctor;

    private Client client;

    private GregorianCalendar recordDateTime;

    private Appointment appointment;

    public Record(Doctor doctor, Client client, GregorianCalendar recordDateTime){
        this.doctor = doctor;
        this.client = client;
        this.recordDateTime = recordDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public GregorianCalendar getRecordDateTime() {
        return recordDateTime;
    }

    public void setRecordDateTime(GregorianCalendar recordDateTime) {
        this.recordDateTime = recordDateTime;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
