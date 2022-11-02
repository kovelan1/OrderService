package com.order.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Restorent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long restorentId;
	private String name;
	
	@OneToMany(mappedBy = "restorent")
	private List<Item> items;
	
	@JsonIgnore
	@OneToMany(mappedBy = "restorent")
	private List<Order> orders;
	
	public Restorent() {
		// TODO Auto-generated constructor stub
	}

	

	public long getRestorentId() {
		return restorentId;
	}



	public void setRestorentId(long restorentId) {
		this.restorentId = restorentId;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
	
	
	
	
	
}
