package com.storeapp.web.Mapper;

import com.storeapp.web.DTO.ClientDto;
import com.storeapp.web.Entity.Client;

public class ClientMapper {

    public ClientDto mapToClientDto(Client client){
        ClientDto clientDto = ClientDto.builder()
                              .id(client.getId())
                              .name(client.getName())
                              .email(client.getEmail())
                              .phone(client.getPhone())
                              .hasSubscription(client.isHasSubscription())
                              .build();
        return clientDto;  
    }
}
