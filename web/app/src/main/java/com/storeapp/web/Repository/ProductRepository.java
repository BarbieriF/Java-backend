package com.storeapp.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storeapp.web.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
