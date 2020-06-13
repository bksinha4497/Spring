package com.tm.database.databasedemo;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tm.database.databasedemo.entity.Person;
import com.tm.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(JpaDemoApplication.class);

	@Autowired
	PersonJpaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		logger.info("User id 10001 -> {}", repo.findById(10001));

		logger.info("Inserting -> {}", repo.insert(new Person("Tara", "Berlin", new Timestamp(20200404))));

		logger.info("Update 10003 -> {}", repo.update(new Person(10003, "Pieter", "Utrecht", new Timestamp(20200404))));

		repo.deleteById(10001);

		logger.info("All users -> {}", repo.findAll());
	}

}
