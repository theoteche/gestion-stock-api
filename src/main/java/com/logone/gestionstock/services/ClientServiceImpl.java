package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Override
    public Client ajouterClient(Client client) {
        return null;
    }

    @Override
    public List<Client> lireTousClients() {
        return null;
    }

    @Override
    public void supprimerClient(Long id) {

    }

    @Override
    public Client modifierClient(Client client) {
        return null;
    }
}
