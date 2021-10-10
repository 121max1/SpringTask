package com.maxshkodin.spring.repository;

import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.model.Doctor;
import com.maxshkodin.spring.model.Record;

import java.util.List;

public interface RecordRepository {

    void add(Record record);

    void delete(Record record);

    List<Record> getAll();

    List<Record> getRecordsByDoctor(Doctor doctor);

    List<Record> getRecordsByClient(Client client);

    List<Record> getFutureRecords();
}
