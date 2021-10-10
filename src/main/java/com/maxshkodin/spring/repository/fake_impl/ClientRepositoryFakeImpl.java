package com.maxshkodin.spring.repository.fake_impl;

import com.maxshkodin.spring.model.Client;
import com.maxshkodin.spring.repository.ClientRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientRepositoryFakeImpl implements ClientRepository {

    private final List<Client> clientList;

    public ClientRepositoryFakeImpl() {
        this.clientList = new ArrayList<Client>();
    }

    @Override
    public void add(Client client) {
        clientList.add(client);
    }

    @Override
    public void delete(Client client) {
        clientList.remove(client);
    }

    @Override
    public void update(Client client) {
        Client clientToDelete = clientList.stream().filter(c -> c.getId() == client.getId()).collect(Collectors.toList()).get(0);
        clientList.remove(clientToDelete);
        clientList.add(client);
    }

    @Override
    public List<Client> getAll() {
        return clientList;
    }

    @Override
    public Client getById(int id) {
       return clientList.stream().filter(c -> c.getId() == id).collect(Collectors.toList()).get(0);
    }
}
