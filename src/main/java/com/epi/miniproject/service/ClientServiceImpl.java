package com.epi.miniproject.service;


import com.epi.miniproject.dao.entity.Client;
import com.epi.miniproject.dao.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void addClient(Client client) {clientRepository.save(client); }

    @Override
    public void updateClient(Client client){
        if (client != null){
            Optional<Client> clientFromDB = clientRepository.findById((client.getId()));
            if (clientFromDB.isPresent()){
                clientRepository.save(client);
            }
        }
    }
    @Override
    public void deleteClient(Long id){
        if (id != null){
            clientRepository.deleteById(id);
        }
    }
    @Override
    public List<Client> getAll() { return  clientRepository.findAll(); }


}
