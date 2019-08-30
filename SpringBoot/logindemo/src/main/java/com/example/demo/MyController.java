package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String login()
	{
	
		return "login.jsp";
	}
	@RequestMapping("/verify")
	public ModelAndView greet(User user)
	{
	
		String username=user.getUname();
		String password=user.getPwd();
		ModelAndView mv=new ModelAndView();
		if(username.equals(password))
		{
		
		mv.addObject(user);
		mv.addObject("str","Successful");
		mv.setViewName("welcome.jsp");
		
		}
		else
		{
			mv.setViewName("invalid.jsp");
		}
		return mv;
		
	}
}
