package io.microservices.itemsService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservices.itemsService.beans.Item;
import io.microservices.itemsService.repositories.ItemsRepository;

@RestController("/items")
public class ItemsController {
	
	@Autowired
	ItemsRepository itemsRepo;
	
	@GetMapping("/getAll")
	public List<Item> getAllItems(){
		return itemsRepo.findAll();
	}

}
