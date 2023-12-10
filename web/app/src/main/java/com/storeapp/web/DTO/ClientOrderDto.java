package com.storeapp.web.DTO;

import java.time.LocalDate;

import com.storeapp.web.Entity.Client;
import com.storeapp.web.Entity.Product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ClientOrderDto {

    private Long id;    
    private Client client;
    
    private Product product;   
    
    private LocalDate orderDate;   
    private LocalDate deliveryDate;
    
}