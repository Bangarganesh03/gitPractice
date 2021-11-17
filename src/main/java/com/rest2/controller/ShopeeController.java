package com.rest2.controller;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest2.entity.Item;
import com.rest2.repository.ShopeeRepository;

@RestController
public class ShopeeController {

	@Autowired
	ShopeeRepository repo;

	@GetMapping("/items")
	public List<Item> getItems() {

		return repo.findAll();
	}

	@GetMapping("/home")
	public String getHome() {

		return "this is home page";
	}

	@GetMapping("/items/{id}")
	public Item getItem(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@PostMapping(path = "/items", 
	        consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public Item saveItem(@RequestBody Item item) {		
		return repo.save(item); 
	}
}
