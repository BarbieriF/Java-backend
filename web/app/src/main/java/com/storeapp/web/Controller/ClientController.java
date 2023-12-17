package com.storeapp.web.Controller;




import org.springframework.ui.Model;

import com.storeapp.web.DTO.ClientDto;
import com.storeapp.web.Service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    
    @GetMapping
    public Iterable<ClientDto> clientsList(Model model) {
        return clientService.clientsList();
    }
    
    
}
