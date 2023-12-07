package com.storeapp.web.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private boolean hasSubscription;     
}
