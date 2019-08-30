package com.example.aspects;

import org.springframework.aop.ThrowsAdvice;

public class MyMethodAfterThrowing implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable
	{
		System.out.println("Throw exception captured..");
	}

}
