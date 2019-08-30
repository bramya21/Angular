/**
 * 
 */
package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/web")
public class MyController {

@Autowired
BookRepo repo;

@GetMapping("/books")
public List<Book> sayHello()
{
return repo.findAll();
}

@PostMapping("/books")
public String createBook(@RequestBody Book book)
{
repo.save(book);
return "success";
}


}

