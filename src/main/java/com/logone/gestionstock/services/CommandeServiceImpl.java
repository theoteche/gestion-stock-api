package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Commande;
import com.logone.gestionstock.repositories.CommandeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService{
    private final CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public Commande ajouterCommande(Commande commande) {

        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> afficherToutesLesCommande() {

        return commandeRepository.findAll();
    }

    @Override
    public void supprimerCommande(Long id) {
        commandeRepository.deleteById(id);

    }

    @Override
    public Commande modifierCommande(Commande commande) {

        return commandeRepository.save(commande);
    }
}
