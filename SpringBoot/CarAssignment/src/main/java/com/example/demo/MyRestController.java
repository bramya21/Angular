package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/myweb")
public class MyRestController {
@Autowired
	CarDao dao;
	@GetMapping("/cars")
	public List<Car> listallcars( )
	{
		return dao.findAll();
	}
	@PostMapping("cars/insert")
	public String insertCar(@RequestBody Car c)
	{
		dao.save(c);
		return "success";
	}
	@PutMapping("cars/update")
	public String updateCar(@RequestBody Car c)
	{
		if(dao.existsById(c.getId()))
			dao.save(c);
		else
			return "Record does not exist";
		return "Success";
	}
	@DeleteMapping("cars/delete/{id}")
	public String deleteCar(@PathVariable("id") int id)
	{
		if(dao.existsById(id))
			dao.deleteById(id);
		else
			return "record does not exist";
		return "Success";
	}
}
