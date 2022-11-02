package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Restorent;
import com.order.service.RestorentService;

@RestController
@RequestMapping("/api/restorent")
public class RestorentController {

	@Autowired
	private RestorentService restorentService;
	
	@GetMapping("/all")
	public List<Restorent> getAllRestorents(){
		return restorentService.getAllRestorents();
	}
	
	
	@GetMapping("/{id}")
	public Restorent getRestorentById(@PathVariable("id") long id) {
		return restorentService.getRestorentById(id);
	}
}
