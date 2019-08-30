package com.example.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
	        try {
	            System.out.println("Before Advice invoked ");
	            arg0.proceed();
	            System.out.println("After Advice invoked ");
	            return null;
	        } catch (Throwable e) {
	            throw e;
	        }
	}

}
