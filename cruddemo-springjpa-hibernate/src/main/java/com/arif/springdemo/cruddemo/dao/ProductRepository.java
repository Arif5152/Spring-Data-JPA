package com.arif.springdemo.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.springdemo.cruddemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
