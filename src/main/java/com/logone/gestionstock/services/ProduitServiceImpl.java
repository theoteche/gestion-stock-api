package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Produit;
import com.logone.gestionstock.repositories.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService{

    final ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit ajouterProduit(Produit produit) {
        // ajouter un produit
        Produit produitAjoute = produitRepository.save(produit);
        return produitAjoute;
    }

    @Override
    public List<Produit> lireTousProduits() {
        List<Produit> produitList = produitRepository.findAll();
        return produitList;
    }

    @Override
    public void supprimerProduit(Long id) {
        produitRepository.deleteById(id);

    }

    @Override
    public Produit modifierProduit(Produit produit) {
        return produitRepository.save(produit);
    }
}
