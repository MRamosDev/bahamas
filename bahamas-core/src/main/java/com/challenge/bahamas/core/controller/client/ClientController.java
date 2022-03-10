package com.challenge.bahamas.core.controller.client;


import com.challenge.bahamas.core.model.client.Client;
import com.challenge.bahamas.core.model.client.dto.SaveClientDTO;
import com.challenge.bahamas.core.service.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("retrieve-bahamas-client/{clientId}")
    Client getClient(@PathVariable("clientId") Long clientId){
        return clientService.getClient(clientId);
    }

    @PostMapping("store-bahamas-clients/{invoiceId}")
    SaveClientDTO saveClient(@PathVariable("invoiceId") Long invoiceId, @RequestBody SaveClientDTO client){
        return clientService.saveClient(invoiceId, client);
    }

}
