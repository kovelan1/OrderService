package com.order.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "restorentOrder")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private Restorent restorent;
	
	@ManyToMany
	@JoinTable(name = "oder_item",
			joinColumns=@JoinColumn(name="order_id"),
		    inverseJoinColumns=@JoinColumn(name="item_id"))
	private List<Item> items;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	

	public long getOrderId() {
		return orderId;
	}



	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Restorent getRestorent() {
		return restorent;
	}

	public void setRestorent(Restorent restorent) {
		this.restorent = restorent;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
