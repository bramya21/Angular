package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LogAspect {
	@Before(value="execution(* com.example.demo.EmployeeService.*(..)) and args(name,empId)")
    public void beforeAdvice(JoinPoint joinpoint ,String name, String empId)
    {
        System.out.println("Before method" + joinpoint.getSignature());
        System.out.println("creating employee with" + name + "and" + empId);
    }
	
}
