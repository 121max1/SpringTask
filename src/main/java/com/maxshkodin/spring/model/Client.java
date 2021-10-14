package com.maxshkodin.spring.model;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;

    private String fullName;

    private String phoneNumber;

    private String email;

    private String login;

    private String password;

    private List<Record> records;

    private List<Appointment> appointments;

    public Client(int id, String fullName, String phoneNumber, String email,String login, String password) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.login = login;
        this.password = password;
        records = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public Client(String fullName, String phoneNumber, String email, String login, String password) {
        this.fullName  = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.login = login;
        this.password = password;
        records = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
