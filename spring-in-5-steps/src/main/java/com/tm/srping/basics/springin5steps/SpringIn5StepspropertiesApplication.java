package com.tm.srping.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.tm.srping.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan("com.tm.srping.basics.springin5steps.*")
@PropertySource("classpath:app.properties")
public class SpringIn5StepspropertiesApplication {

	public static void main(String[] args) {

		Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepspropertiesApplication.class);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepspropertiesApplication.class)) {

			// ConfigurableApplicationContext applicationContext =
			// SpringApplication.run(SpringIn5StepsBasicApplication.class,args);
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			System.out.println(someExternalService.getUrl());
		}
	}

}
