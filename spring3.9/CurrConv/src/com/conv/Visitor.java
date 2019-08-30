package com.conv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Visitor {
	@Value("ramya")
	String name;
	@Autowired
	@Qualifier("indtodollar")	
	CurrencyConverter c;
	
	public Visitor( ) {
		
	}

	

	public void callmethod()
	{
		System.out.println(c.convert(71.4));
	}
}
