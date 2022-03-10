package com.challenge.bahamas.core.util;

import com.challenge.bahamas.core.external.gov.GovClient;
import com.challenge.bahamas.core.external.invoicexp.InvoiceXpClient;
import com.challenge.bahamas.core.model.client.Client;
import com.challenge.bahamas.core.model.client.dto.ClientDTO;
import com.challenge.bahamas.core.model.client.dto.SaveClientDTO;
import com.challenge.bahamas.core.model.contact.PreferredContact;

public class MockUtils {


    // starts the clients mock *****************************************************************************************

    public static InvoiceXpClient mockInvoiceXPClient() {

        return new InvoiceXpClient() {

            @Override
            public Client getClient(Long invoiceId, String apiToken) {
                return mockClient();
            }

            @Override
            public SaveClientDTO saveClient(SaveClientDTO client, String apiToken) {
                return client;
            }

        };
    }

    public static GovClient mockGovClient() {
        return new GovClient() {
            @Override
            public ClientDTO saveClient(Long invoiceId, ClientDTO client) {
                return client;
            }
        };
    }

    // ends the clients mock *******************************************************************************************

    // starts the objects mock *****************************************************************************************

    private static final String STRING = "STRING";
    private static final String EMAIL = "mail@example.com";
    private static final Long LONG = 0L;
    private static final int INTEGER = 0;

    public static Client mockClient(ClientDTO clientDTO) {
        return Client.builder()
                .id(0L)
                .address(STRING)
                .city(STRING)
                .country(STRING)
                .fax(STRING)
                .observations(STRING)
                .openAccountLink(STRING)
                .phone(STRING)
                .preferredContact(PreferredContact.builder()
                        .email(EMAIL)
                        .name(STRING)
                        .phone(STRING).build())
                .sendOptions(INTEGER)
                .website(STRING)
                .postalCode(STRING)
                .name(clientDTO.getName())
                .email(clientDTO.getEmail())
                .fiscalId(clientDTO.getFiscalId())
                .build();
    }

    public static Client mockClient() {
        return Client.builder()
                .id(LONG)
                .address(STRING)
                .city(STRING)
                .country(STRING)
                .fax(STRING)
                .observations(STRING)
                .openAccountLink(STRING)
                .phone(STRING)
                .preferredContact(PreferredContact.builder()
                        .email(EMAIL)
                        .name(STRING)
                        .phone(STRING).build())
                .sendOptions(INTEGER)
                .website(STRING)
                .postalCode(STRING)
                .name(STRING)
                .email(EMAIL)
                .fiscalId(STRING)
                .build();
    }

    // ends the objects mock *******************************************************************************************
}
