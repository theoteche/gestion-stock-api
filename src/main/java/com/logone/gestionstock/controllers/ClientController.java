package com.logone.gestionstock.controllers;


import com.logone.gestionstock.entities.Client;
import com.logone.gestionstock.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(path = "/add")
    @ResponseBody
    public Client addClient(@RequestBody Client clt){
        return clientService.ajouterClient(clt);
    }
    @GetMapping("/all")
    public List<Client> getAllClients(){
        return clientService.lireTousClients();
    }
    @DeleteMapping(path = "/delete/{client-id}")
    public String deleteClient(@PathVariable("client-id") Long idp){
        clientService.supprimerClient(idp);
        return "Client supprimé";
    }
    @PutMapping("/update")
    @ResponseBody
    public Client modifyClient(@RequestBody Client c){
        return clientService.modifierClient(c);

    }
}
