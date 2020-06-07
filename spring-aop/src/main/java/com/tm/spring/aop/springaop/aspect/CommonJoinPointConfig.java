package com.tm.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.tm.spring.aop.springaop.business.*.*(..))")
	public void DataLayer() {
	}

	@Pointcut("@annotation(com.tm.spring.aop.springaop.aspect.TrackTime)")
	public void TracktimeAnnotation() {
	}
}
