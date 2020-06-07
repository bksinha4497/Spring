package com.tm.spring.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tm.spring.aop.springaop.business.BusinessClass1;
import com.tm.spring.aop.springaop.business.BusinessClass2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);
	@Autowired
	private BusinessClass1 business1;
	@Autowired
	private BusinessClass2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(business1.calcSomething());
		logger.info(business2.calcSomething());
	}

}
