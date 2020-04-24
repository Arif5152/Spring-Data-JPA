package com.arif.springdemo.cruddemo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arif.springdemo.cruddemo.dao.CustomerRepository;
import com.arif.springdemo.cruddemo.dao.ProductRepository;
import com.arif.springdemo.cruddemo.dto.OrderRequest;
import com.arif.springdemo.cruddemo.dto.OrderResponse;
import com.arif.springdemo.cruddemo.entity.Customer;
import com.arif.springdemo.cruddemo.entity.Product;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request)
	{
		System.err.println(request.getCustomer().toString());
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders()
	{
		return customerRepository.findAll();
	}
	@GetMapping("/productList")
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	@GetMapping("/getJoinInfo")
	public List<OrderResponse> getJoinInformation()
	{
		return customerRepository.getJoinInformation();
	}
	
	
}
