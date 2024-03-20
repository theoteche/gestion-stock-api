package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Produit;

import java.util.List;

public interface ProduitService {

    //CRUD
    Produit ajouterProduit(Produit produit);
    List<Produit> lireTousProduits();
    void supprimerProduit(Long id);
    Produit modifierProduit(Produit produit);
}
