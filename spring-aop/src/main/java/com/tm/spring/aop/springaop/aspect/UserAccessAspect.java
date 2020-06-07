package com.tm.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

	// ASPECT --> combination of pointcut and advice
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method call will i intercept
	// execution(* PACKAGE.*.*(..)) -- > PointCut
	// Weaving & Weaver
	@Before("execution(* com.tm.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) { // JoinPoint -> specific execution interception
		// ADVICE
		logger.info("Check for user access before method call");
		logger.info("Intercepted method call -- {} ", joinPoint);
	}
}
