package com.storeapp.web.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapp.web.Entities.ClientOrder;

public interface OrderRepository extends JpaRepository<ClientOrder,Long> {   

    
}
