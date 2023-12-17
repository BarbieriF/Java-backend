package com.storeapp.web.Service;


import java.util.List;

import com.storeapp.web.DTO.ClientDto;
import com.storeapp.web.Entity.Client;



public interface ClientService {  

    public List<ClientDto> clientsList();

    public Client saveClient(ClientDto clientDto);
    
}
