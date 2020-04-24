package com.arif.springdemo.cruddemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {

	private String name;
	private String productName;
	private int price;
	
	
	public OrderResponse()
	{
		
	}
	
	



	public OrderResponse(String name, String productName) {
		this.name = name;
		this.productName = productName;
		
	}
	

	public OrderResponse(String name, String productName,int price) {
		this.name = name;
		this.productName = productName;
		this.price = price;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}





	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", productName=" + productName + "]";
	}
	
	
}
