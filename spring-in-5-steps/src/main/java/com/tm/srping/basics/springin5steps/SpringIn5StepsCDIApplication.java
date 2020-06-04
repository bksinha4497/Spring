package com.tm.srping.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tm.srping.basics.springin5steps.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan("com.tm.srping.basics.springin5steps.cdi")
public class SpringIn5StepsCDIApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsCDIApplication.class);
		// ConfigurableApplicationContext applicationContext =
		// SpringApplication.run(SpringIn5StepsCDIApplication.class,args);

		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

		System.out.println(someCdiBusiness);
		applicationContext.close();
	}

}
