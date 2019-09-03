package io.microservices.itemsService.DataSeed;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import io.microservices.itemsService.beans.Item;
import io.microservices.itemsService.repositories.ItemsRepository;

@Component
public class Seed {

	@Autowired
	ItemsRepository itemsRepo;

	@PostConstruct
	private void Seeing() {
		Faker faker = new Faker();
		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < 10; i++) {
			Item item = new Item();
			item.setLabel(faker.pokemon().name());
			item.setDescription(faker.pokemon().location());
			data.add(item);
		}
		itemsRepo.saveAll(data);

	}

}
