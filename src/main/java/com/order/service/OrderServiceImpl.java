package com.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.model.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) {
		
		return orderRepository.save(order);
	}
}
