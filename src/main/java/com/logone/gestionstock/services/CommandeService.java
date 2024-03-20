package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Commande;

import java.util.List;

public interface CommandeService {
    Commande ajouterCommande(Commande commande);
    List<Commande> afficherToutesLesCommande();
    void supprimerCommande(Long id);
    Commande modifierCommande(Commande commande);
}
