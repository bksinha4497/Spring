package com.tm.srping.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tm.srping.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.tm.srping.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class);
		// ConfigurableApplicationContext applicationContext =
		// SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		System.out.println(componentDAO);
		applicationContext.close();

	}

}
