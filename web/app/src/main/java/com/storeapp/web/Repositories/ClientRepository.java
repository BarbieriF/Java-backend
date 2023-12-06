package com.storeapp.web.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapp.web.Entities.Client;
import java.util.List;


public interface ClientRepository extends JpaRepository<Client,Long>{   

    Optional<Client> findById(Long id);
    List<Client> findAll();    
}
