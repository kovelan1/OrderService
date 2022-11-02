package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.model.Restorent;
import com.order.repository.RestorentRepository;

@Service
public class RestorentServiceImpl implements RestorentService{

	@Autowired
	private RestorentRepository restorentRepository;

	@Override
	public List<Restorent> getAllRestorents() {
		
		return restorentRepository.findAll();
	}

	@Override
	public Restorent getRestorentById(long id) {
		// TODO Auto-generated method stub
		return restorentRepository.findById(id).get();
	}
	
	
}
