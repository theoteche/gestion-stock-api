package com.logone.gestionstock.controllers;

import com.logone.gestionstock.entities.Commande;
import com.logone.gestionstock.services.CommandeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commande")
public class CommandeController {
    private final CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }
    // POST http://localhost:8081/api/commande/add
    @PostMapping(path = "/add")
    @ResponseBody
    public Commande addCommande(@RequestBody Commande cmd){
        return commandeService.ajouterCommande(cmd);
    }
    @GetMapping("/all")
    @ResponseBody
    public List<Commande> getAllCommand(){
        return commandeService.afficherToutesLesCommande();
    }
    @DeleteMapping(path = "/delete/{commande-id}")
    public String deleteCommand(@PathVariable("commande-id") Long idp){
        commandeService.supprimerCommande(idp);
        return "commande supprimé";
    }
    @PutMapping("/update")
    @ResponseBody
    public Commande updateCommande(@RequestBody Commande c){
        Commande commandeModifier =  commandeService.modifierCommande(c);
        return commandeModifier;

    }

}
