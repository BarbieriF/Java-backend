package com.storeapp.web.Mapper;

import org.springframework.stereotype.Component;

import com.storeapp.web.DTO.ClientDto;
import com.storeapp.web.Entity.Client;

@Component
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

    public Client mapToClient(ClientDto clientDto){
        Client client = Client.builder()
                        .id(clientDto.getId())
                        .name(clientDto.getName())
                        .email(clientDto.getEmail())
                        .phone(clientDto.getPhone())
                        .hasSubscription(clientDto.isHasSubscription())
                        .build();
        return client;
    }
}
