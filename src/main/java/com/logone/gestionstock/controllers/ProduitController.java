package com.logone.gestionstock.controllers;

import com.logone.gestionstock.entities.Produit;
import com.logone.gestionstock.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produit")
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    // POST http://localhost:8081/api/produit/add
    @PostMapping(path = "/add")
    @ResponseBody
    public Produit addProduit(@RequestBody Produit p){
        Produit produitDB = produitService.ajouterProduit(p);
        return produitDB;
    }

    // GET http://localhost:8081/api/produit/all
    @GetMapping("/all")
    @ResponseBody
    public List<Produit> getAllProducts(){
        List<Produit> listeProduitDB = produitService.lireTousProduits();
        return listeProduitDB;
    }
    // DELETE http://localhost:8081/api/produit/delete/2
    @DeleteMapping(path = "/delete/{produit-id}")
    public String deleteProduit(@PathVariable("produit-id") Long idP){
        produitService.supprimerProduit(idP);
        return "Supprimer avec succès";
    }
    //PUT http://localhost:8081/api/produit/update
    @PutMapping("/update")
    @ResponseBody
    public Produit modifyProduit(@RequestBody Produit p){
       Produit produitmodifier = produitService.modifierProduit(p);
       return produitmodifier;
    }
}
