package com.maxshkodin.spring.service;

import com.maxshkodin.spring.model.Client;

import java.util.List;

public interface ClientService {

    void add(Client client);

    void delete(Client client);

    void update(Client client);

    Client getById(int id);

    List<Client> getAll();

}
