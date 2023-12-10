package com.storeapp.web.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ClientDto {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private boolean hasSubscription;     
}
