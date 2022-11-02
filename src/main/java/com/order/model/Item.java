package com.order.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iteamId;
	private String name;
	private double price;
	
	@JsonIgnore
	@ManyToOne
	private Restorent restorent;
	
	@ManyToMany(mappedBy = "items")
	private List<Order> orders;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIteamId() {
		return iteamId;
	}

	public void setIteamId(long iteamId) {
		this.iteamId = iteamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Restorent getRestorent() {
		return restorent;
	}

	public void setRestorent(Restorent restorent) {
		this.restorent = restorent;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	
}
