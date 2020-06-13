package com.tm.database.databasedemo;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.tm.database.databasedemo.entity.Person;
import com.tm.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(DatabaseDemoApplication.class);
	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		logger.info("all Users -> {}", personJdbcDao.findAll().toString());
		logger.info("Person id 10001 details -> {}", personJdbcDao.findById(10001).toString());
		logger.info("Deleting Person 10002  -> {}", personJdbcDao.deleteById(10002));
		logger.info("inserting Person with Id 10004  -> {}",
				personJdbcDao.insertperson(new Person(10004, "Biswajit", "Bangalore", new Timestamp(19970404))));
		logger.info("inserting Person with Id 10001  -> {}",
				personJdbcDao.updatePerson(new Person(10001, "Rishab", "Bangalore", new Timestamp(19970826))));

		logger.info("all Users using customer row mapper-> {}", personJdbcDao.findAllUsingCustomMapper().toString());

	}

}
