package com.harsh.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.springboot.crud.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
