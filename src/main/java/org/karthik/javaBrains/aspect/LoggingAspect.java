package org.karthik.javaBrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void loggingAdvice() {
		System.out.println("Advice run. Get Name() called.");
	}
	
}
