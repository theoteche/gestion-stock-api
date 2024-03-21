package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Client;
import com.logone.gestionstock.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client ajouterClient(Client client) {

        Client clientAjouter = clientRepository.save(client);
        return clientAjouter;
    }

    @Override
    public List<Client> lireTousClients() {
        List<Client> clientList = clientRepository.findAll();
        return clientList;
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }
}
