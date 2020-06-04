package com.tm.srping.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tm.srping.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsScopeApplication.class);
		// ConfigurableApplicationContext applicationContext =
		// SpringApplication.run(SpringIn5StepsScopeApplication.class,args);
		PersonDAO dao1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO dao2 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", dao1);
		LOGGER.info("{}", dao1.getJdbcConncetion());
		LOGGER.info("{}", dao2);
		LOGGER.info("{}", dao2.getJdbcConncetion());
		applicationContext.close();
	}

}
