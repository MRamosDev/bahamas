package com.challenge.bahamas.core.model.client.mapper;

import com.challenge.bahamas.core.model.client.Client;
import com.challenge.bahamas.core.model.client.dto.ClientDTO;

public class ClientConverter {

    public static ClientDTO convert(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDTO.ClientDTOBuilder<?, ?> clientDTO = ClientDTO.builder();

        clientDTO.name( client.getName() );
        clientDTO.email( client.getEmail() );
        clientDTO.fiscalId( client.getFiscalId() );

        return clientDTO.build();
    }



}
