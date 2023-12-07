package com.storeapp.web.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.storeapp.web.Entity.Client;


public interface ClientRepository extends CrudRepository<Client,Long>{ 

    Optional<Client> findById(Long id);
     
}
