package com.conv.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.conv.Visitor;
public class TestCurrencyConverter {
	public static void main(String args[])
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ccbean.xml");
	     Visitor us=(Visitor)context.getBean("v");
	     us.callmethod();
	}
}
