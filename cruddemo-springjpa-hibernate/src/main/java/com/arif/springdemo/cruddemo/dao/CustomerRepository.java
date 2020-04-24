package com.arif.springdemo.cruddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arif.springdemo.cruddemo.dto.OrderResponse;
import com.arif.springdemo.cruddemo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	//write JPA query
	@Query("select new com.arif.springdemo.cruddemo.dto.OrderResponse (c.name,p.productName) from Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();
}
