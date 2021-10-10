package com.maxshkodin.spring.repository;

import com.maxshkodin.spring.model.Client;

import java.util.List;

public interface ClientRepository {

    void add(Client client);

    void delete(Client client);

    void update(Client client);

    List<Client> getAll();

    Client getById(int id);
}
