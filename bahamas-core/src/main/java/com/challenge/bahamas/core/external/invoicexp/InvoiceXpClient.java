package com.challenge.bahamas.core.external.invoicexp;

import com.challenge.bahamas.core.model.client.Client;
import com.challenge.bahamas.core.model.client.dto.SaveClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value="InvoiceXp", url = "http://localhost:8081/")
public interface InvoiceXpClient {

    @GetMapping("{clientId}")
    Client getClient(@PathVariable("clientId") Long clientId, @RequestParam(value = "api_key") String apiToken);

    @PostMapping
    SaveClientDTO saveClient(@RequestBody SaveClientDTO client, @RequestParam(value = "api_key") String apiToken);

}
