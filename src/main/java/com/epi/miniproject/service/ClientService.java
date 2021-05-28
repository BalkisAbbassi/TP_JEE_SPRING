package com.epi.miniproject.service;


import com.epi.miniproject.dao.entity.Client;

import java.util.List;

public interface ClientService {
    void addClient (Client client);
    void updateClient(Client client);
    void deleteClient(Long id);

    List<Client> getAll();

}
