package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@Autowired
	EmpDbDao dao;
	
	@RequestMapping("/")
	public String welcome()
	{
		return "welcome.jsp";
	}
	@RequestMapping("/displayAll")
	@ResponseBody
	public String displayAllEmployees()
	{
		return dao.findAll().toString();
	}
	@RequestMapping("/displayEmp")
	@ResponseBody
	public Optional<Employee> displayEmployee(@RequestParam int empid)
	{
		return dao.findById(empid);
	}
	@RequestMapping("/displayByDesig")
	@ResponseBody
	public List<Employee> displayByDes(@RequestParam String designation)
	{
		return dao.findByDesignation(designation);
	}
	@RequestMapping("/displayByAge")
	@ResponseBody
	public List<Employee> displayByAge(@RequestParam String designation)
	{
		return dao.getEmployeeSortedByAge(designation);
	}
	@RequestMapping("/insertEmp")
	@ResponseBody
	public String createEmployee(Employee emp)
	{
		dao.save(emp);
		return "successfully inserted";
	}
	@RequestMapping("/updateEmp")
	@ResponseBody
	public String updateEmployee(Employee emp)
	{
		int id=emp.getEmpid();
		if(dao.existsById(id))
		{	
		dao.save(emp);
		return "successfully updates/inserted";
		}
		else
		{
			return "invalid id";
			
		}
	}
	@RequestMapping("/deleteEmp")
	@ResponseBody
	public String deleteEmployee(Employee emp)
	{
		int id=emp.getEmpid();
		if(dao.existsById(id))
		{	
		dao.deleteById(id);
		return "successfully deleted";
		}
		else
		{
			return "invalid id";
			
		}
	}
}
