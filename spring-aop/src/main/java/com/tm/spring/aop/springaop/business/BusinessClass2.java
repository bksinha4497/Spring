package com.tm.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.spring.aop.springaop.data.Dao2;

@Service
public class BusinessClass2 {

	@Autowired
	private Dao2 dao2;

	public String calcSomething() {
		return dao2.retreiveSomething();
	}

}
