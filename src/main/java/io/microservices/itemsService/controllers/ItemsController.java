package io.microservices.itemsService.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservices.itemsService.beans.Item;
import io.microservices.itemsService.repositories.ItemsRepository;

@RestController
@RequestMapping("itemsWS")
public class ItemsController {

	@Autowired
	ItemsRepository itemsRepo;

	@GetMapping(value = "/isUp")
	public String isUp() {
		return "Yeah it is !";
	}

	@GetMapping(value = "/getAll")
	public List<Item> getAllItems() {
		return itemsRepo.findAll();
	}

	@GetMapping(value = "/getItemName/{id}")
	public String getName(@PathVariable("id") int id) {
		Optional<Item> item = itemsRepo.findById(id);
		return item.isPresent() 
				? item.get().getLabel() 
				: "NOT FOUND";
	}

}
