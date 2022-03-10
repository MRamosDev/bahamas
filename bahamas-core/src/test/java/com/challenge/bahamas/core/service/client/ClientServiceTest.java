package com.challenge.bahamas.core.service.client;

import com.challenge.bahamas.core.external.ExternalServicesSystemConfig;
import com.challenge.bahamas.core.external.gov.GovClient;
import com.challenge.bahamas.core.external.invoicexp.InvoiceXpClient;
import com.challenge.bahamas.core.model.client.Client;
import com.challenge.bahamas.core.model.client.dto.ClientDTO;
import com.challenge.bahamas.core.model.client.dto.SaveClientDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static com.challenge.bahamas.core.util.MockUtils.mockClient;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class ClientServiceTest {

    private final Client CLIENT = mockClient();

    private final ClientDTO CLIENTDTO = ClientDTO.builder().email("example@test.com").apiToken("TOKEN").fiscalId("id").name("name").build();

    private final SaveClientDTO SAVE_CLIENT_DTO = new SaveClientDTO(CLIENT);

    @Mock
    ExternalServicesSystemConfig externalServicesSystemConfig;

    @InjectMocks
    ClientService clientService;

    @Mock
    InvoiceXpClient invoiceXpClient;

    @Mock
    GovClient govClient;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        when(externalServicesSystemConfig.getApiToken()).thenReturn("API TOKEN");
        when(govClient.saveClient(any(),any())).thenReturn(CLIENTDTO);
        when(invoiceXpClient.saveClient(any(),any())).thenReturn(SAVE_CLIENT_DTO);
        when(invoiceXpClient.getClient(any(),any())).thenReturn(CLIENT);
    }

    @Test
    void saveClient() {
        assertEquals(clientService.saveClient(1L, SAVE_CLIENT_DTO),SAVE_CLIENT_DTO);
    }

    @Test
    void getClient() {
        assertEquals(clientService.getClient(1L),CLIENT);
    }
}