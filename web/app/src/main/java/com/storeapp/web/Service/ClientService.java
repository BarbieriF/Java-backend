package com.storeapp.web.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.storeapp.web.DTO.ClientDto;
import com.storeapp.web.Mapper.ClientMapper;
import com.storeapp.web.Repository.ClientRepository;

public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Autowired
    public ClientService(ClientRepository clientRepository, ClientMapper clientMapper){
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    public List<ClientDto> clientsList(){
        List <ClientDto> clientsList = clientRepository.findAll()
                                       .stream().map((Client) -> clientMapper.mapToClientDto(Client))
                                       .collect(Collectors.toList());
        return clientsList;
    }
}
