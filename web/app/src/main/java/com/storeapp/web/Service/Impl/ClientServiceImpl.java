package com.storeapp.web.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.storeapp.web.DTO.ClientDto;
import com.storeapp.web.Entity.Client;
import com.storeapp.web.Mapper.ClientMapper;
import com.storeapp.web.Repository.ClientRepository;
import com.storeapp.web.Service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper; 

    
    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper){
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    public List<ClientDto> clientsList(){
        List <Client> clientsList = clientRepository.findAll();
                                       
        return clientsList.stream().map((clientMapper::mapToClientDto)).collect(Collectors.toList());
        
    }

    @Override
    public Client saveClient(ClientDto clientDto) {
        Client client = clientMapper.mapToClient(clientDto);
        clientRepository.save(client);
        return client;
    }
    
}
