package com.storeapp.web.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapp.web.Entity.Client;


public interface ClientRepository extends JpaRepository<Client,Long>{ 
    
     
}
