package com.storeapp.web.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private Integer stock;
    private boolean onSale; 
}