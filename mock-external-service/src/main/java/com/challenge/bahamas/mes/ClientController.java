package com.challenge.bahamas.mes;

import com.challenge.bahamas.core.model.client.Client;
import com.challenge.bahamas.core.model.client.dto.ClientDTO;
import com.challenge.bahamas.core.model.client.dto.SaveClientDTO;
import org.springframework.web.bind.annotation.*;

import static com.challenge.bahamas.core.util.MockUtils.mockClient;

@RestController
@RequestMapping
public class ClientController {



    @GetMapping("{clientId}")
    Client getClient(@PathVariable("clientId") Long clientId, @RequestParam(value = "api_key") String apiToken){
        return mockClient();
    }

    @PostMapping
    SaveClientDTO saveClient(@RequestBody SaveClientDTO client, @RequestParam(value = "api_key") String apiToken){
        return client;
    }

    @PostMapping("register/{invoiceId}")
    ClientDTO saveClient(@PathVariable("invoiceId") Long invoiceId, @RequestBody ClientDTO client){
        return client;
    }

}
