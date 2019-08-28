package io.microservices.itemsService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.microservices.itemsService.beans.Item;

public interface ItemsRepository extends JpaRepository<Item, Integer> {

}
