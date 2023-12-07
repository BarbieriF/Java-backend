package com.storeapp.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapp.web.Entity.ClientOrder;

public interface OrderRepository extends JpaRepository<ClientOrder,Long> {   

    
}
