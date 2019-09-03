package io.microservices.itemsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EntityScan("io.microservices.itemsService.beans")
@EnableJpaRepositories("io.microservices.itemsService.repositories")
@ComponentScan("io.microservices.itemsService")
@SpringBootApplication
public class ItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemsApplication.class, args);
	}

}
