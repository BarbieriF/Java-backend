package com.storeapp.web.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.storeapp.web.DTO.ClientDto;
import com.storeapp.web.Entity.Client;
import com.storeapp.web.Mapper.ClientMapper;
import com.storeapp.web.Repository.ClientRepository;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    
    public ClientService(ClientRepository clientRepository, ClientMapper clientMapper){
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    public List<ClientDto> clientsList(){
        List <Client> clientsList = clientRepository.findAll();
                                       
        return clientsList.stream().map((clientMapper::mapToClientDto)).collect(Collectors.toList());
    }
}
