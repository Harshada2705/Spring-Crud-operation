package com.Harsh.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Harsh.springboot.crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
