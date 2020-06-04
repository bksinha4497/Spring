package com.tm.srping.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	private Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);
	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;

	public int binarySearch(int[] numbers, int nsearch) {
		int[] sortedNumber = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		LOGGER.info("All dependencies are obtained then this method is called");
	}

	@PreDestroy
	public void preDestroy() {
		LOGGER.info("Before Bean is removed out of context");
	}
}
