package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Commande;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService{
    @Override
    public Commande ajouterCommande(Commande commande) {
        return null;
    }

    @Override
    public List<Commande> afficherToutesLesCommande() {
        return null;
    }

    @Override
    public void supprimerCommande(Long id) {

    }

    @Override
    public Commande modifierCommande(Commande commande) {
        return null;
    }
}
