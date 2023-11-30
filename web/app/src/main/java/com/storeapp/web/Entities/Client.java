package com.storeapp.web.Entities;

import org.springframework.data.annotation.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = )
    private Long id;
    private String name;
    private String email;
    private String phone;
    
    public Client(){        
    }

    public Client(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }   


}
