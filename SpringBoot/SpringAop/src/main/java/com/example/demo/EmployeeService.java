package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class EmployeeService {

	public Employee createEmployee( String name, String id)
	{
		Employee e=new Employee();
		e.setEmpId(id);
		e.setName(name);
		return e;
		
	}
	public void deleteEmployee(@RequestParam String id)
	{
		System.out.println("Removed employee id = "+id);
	}
	
	
}
