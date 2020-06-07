package com.tm.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAOPAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "execution(* com.tm.spring.aop.springaop.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {

		logger.info("Returned with value -- {} and result -- {} ", joinPoint, result);
	}

	@AfterThrowing(value = "execution(* com.tm.spring.aop.springaop.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {

		logger.info("{} and exception	 -- {} ", joinPoint, exception);
	}

	// Common including after execution method or throwing exception
	@After(value = "execution(* com.tm.spring.aop.springaop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {

		logger.info("After execution or throwing exception	 -- {} ", joinPoint);
	}
}
