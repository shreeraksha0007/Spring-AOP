package com.shreeraksha.Spring_AOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HijactAfterMethod implements AfterReturningAdvice {

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("HijackMethod: After method hijacked..");
	}
}
