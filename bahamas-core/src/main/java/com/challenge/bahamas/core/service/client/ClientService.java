package com.challenge.bahamas.core.service.client;

import com.challenge.bahamas.core.external.ExternalServicesSystemConfig;
import com.challenge.bahamas.core.external.gov.GovClient;
import com.challenge.bahamas.core.external.invoicexp.InvoiceXpClient;
import com.challenge.bahamas.core.model.client.Client;
import com.challenge.bahamas.core.model.client.dto.ClientDTO;
import com.challenge.bahamas.core.model.client.dto.SaveClientDTO;
import com.challenge.bahamas.core.model.client.mapper.ClientConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    @Autowired
    ExternalServicesSystemConfig externalServicesSystemConfig;

// @TODO If you wanted to use the code mock version, just remove the comments and the autowired below

//    private final InvoiceXpClient invoiceXpClient = mockInvoiceXPClient();
//
//    private final GovClient govClient = mockGovClient();

    @Autowired
    InvoiceXpClient invoiceXpClient;

    @Autowired
    GovClient govClient;

    public SaveClientDTO saveClient(Long invoiceId, SaveClientDTO client) {
        SaveClientDTO savedClient = invoiceXpClient.saveClient(client, externalServicesSystemConfig.getApiToken());
        ClientDTO dto = ClientConverter.convert(savedClient.getClient());
        dto.setApiToken(externalServicesSystemConfig.getApiToken());

        govClient.saveClient(invoiceId, dto);

        return savedClient;
    }

    public Client getClient(Long invoiceId) {
        return invoiceXpClient.getClient(invoiceId, externalServicesSystemConfig.getApiToken());
    }


}
