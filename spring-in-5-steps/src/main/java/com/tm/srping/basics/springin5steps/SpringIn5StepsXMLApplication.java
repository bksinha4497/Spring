package com.tm.srping.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tm.srping.basics.springin5steps.xml.XMLPersonDAO;

public class SpringIn5StepsXMLApplication {

	public static void main(String[] args) {

		Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLApplication.class);
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			LOGGER.info("BEANS ARRAY ------>{}", (Object) applicationContext.getBeanDefinitionNames());
			XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
			LOGGER.info("----->{}", xmlPersonDAO);
		}
	}

}
