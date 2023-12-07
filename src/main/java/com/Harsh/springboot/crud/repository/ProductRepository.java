package com.harsh.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.springboot.crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
