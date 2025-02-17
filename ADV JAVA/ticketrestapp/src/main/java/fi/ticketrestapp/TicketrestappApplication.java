package fi.ticketrestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Entity;

@SpringBootApplication(scanBasePackages = {"fi.ticketrestapp.services","fi.ticketrestapp.controllers"})
@EntityScan(basePackages = {"fi.ticketrestapp.entity"})
@EnableJpaRepositories(basePackages = {"fi.ticketrestapp.repository"})
public class TicketrestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketrestappApplication.class, args);
	}

}
