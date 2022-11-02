package com.order.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	


	public long getCustomerId() {
		return customerId;
	}





	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	
}
