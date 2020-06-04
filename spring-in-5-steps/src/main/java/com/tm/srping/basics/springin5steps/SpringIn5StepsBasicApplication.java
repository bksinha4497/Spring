package com.tm.srping.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tm.srping.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.tm.srping.basics.springin5steps.*")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

		Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {

			// ConfigurableApplicationContext applicationContext =
			// SpringApplication.run(SpringIn5StepsBasicApplication.class,args);
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			int result = binarySearch.binarySearch(new int[] { 12, 4, 6, 3 }, 3);
			LOGGER.info(String.valueOf(result));
		}
	}

}
