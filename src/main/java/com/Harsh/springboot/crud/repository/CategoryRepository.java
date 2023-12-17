package com.Harsh.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Harsh.springboot.crud.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
