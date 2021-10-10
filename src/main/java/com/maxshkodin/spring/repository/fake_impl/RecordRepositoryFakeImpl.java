package com.maxshkodin.spring.repository.fake_impl;


import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.model.Doctor;
import com.maxshkodin.spring.model.Record;
import com.maxshkodin.spring.repository.RecordRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class RecordRepositoryFakeImpl implements RecordRepository {

    @Override
    public void add(Record record) {

    }

    @Override
    public void delete(Record record) {

    }

    @Override
    public List<Record> getAll() {
        return null;
    }

    @Override
    public List<Record> getRecordsByDoctor(Doctor doctor) {
        return null;
    }

    @Override
    public List<Record> getRecordsByClient(Client client) {
        return null;
    }

    @Override
    public List<Record> getFutureRecords() {
        return null;
    }
}
