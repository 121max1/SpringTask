package com.maxshkodin.spring.service.impl;

import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.repository.ClientRepository;
import com.maxshkodin.spring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Component
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void add(Client client) {
        clientRepository.add(client);
    }

    @Override
    public void delete(Client client) {
        clientRepository.delete(client);
    }

    @Override
    public void update(Client client) {
        clientRepository.update(client);
    }

    @Override
    public Client getById(int id) {
        return clientRepository.getById(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.getAll();
    }
}
