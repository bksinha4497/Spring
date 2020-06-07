package com.tm.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	public String retreiveSomething() {
		return "Dao1";
	}
}
