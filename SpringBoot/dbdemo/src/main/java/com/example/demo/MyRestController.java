package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRestController {
	@Autowired
	EmpDbDao dao;
	
	@GetMapping(path="/employees",produces="application/xml")
	public List<Employee> getEmployees()
	{
		return dao.findAll();
	}
	@GetMapping("/employee/{empid}")
	public Optional<Employee> getEmployee(@PathVariable("empid") int empid)
	{
		System.out.println("Employee Id = "+empid);
		return dao.findById(empid);
	}
	@PostMapping("/employee")
	public String insertEmp(@RequestBody Employee emp)
	{
		dao.save(emp);
		return "Success";
	}
	
	
}
