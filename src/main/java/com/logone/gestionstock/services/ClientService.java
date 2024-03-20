package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Client;

import java.util.List;

public interface ClientService {

    Client ajouterClient(Client client);
    List<Client> lireTousClients();
    void supprimerClient(Long id);
    Client modifierClient(Client client);
}
