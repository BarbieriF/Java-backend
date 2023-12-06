package com.storeapp.web.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapp.web.Entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
