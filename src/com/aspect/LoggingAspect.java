package com.aspect;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect

public class LoggingAspect {
	@Before("execution(* com.model.SBIBank.deposit(..))")
	public void logInfoBefore(JoinPoint joinPoint){
		Date d=new Date();
		
System.out.println("Today is: "+d);
System.out.println("....Aspect Before Deposit Logging info.....");
System.out.println(joinPoint.getSignature().getName());
	}
	@After("execution (* com.model.SBIBank.withdraw(..))")
	public void logInfoAfter(JoinPoint joinpoint)
	{
		Date d=new Date();
		System.out.println("Today is: "+d);
		System.out.println(".. Aspect After loggingInfo");	
		System.out.println(joinpoint.getSignature().getName());
	}
	@AfterThrowing("execution (* com.model.SBIBank.withdraw(..))")
	public void logError(JoinPoint joinPoint){
System.out.println("----Aspect After throwing exception...");
	}
}
