package com.tm.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.spring.aop.springaop.aspect.TrackTime;
import com.tm.spring.aop.springaop.data.Dao1;

@Service
public class BusinessClass1 {

	@Autowired
	private Dao1 dao1;

	@TrackTime
	public String calcSomething() {
		return dao1.retreiveSomething();
	}

}
