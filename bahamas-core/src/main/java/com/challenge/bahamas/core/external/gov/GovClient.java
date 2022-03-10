package com.challenge.bahamas.core.external.gov;

import com.challenge.bahamas.core.model.client.dto.ClientDTO;
import lombok.NonNull;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(value="Gov", url = "http://localhost:8081/")
public interface GovClient {

    @PostMapping("register/{invoiceId}")
    ClientDTO saveClient(@PathVariable("invoiceId") Long invoiceId,@NonNull ClientDTO client);

}
