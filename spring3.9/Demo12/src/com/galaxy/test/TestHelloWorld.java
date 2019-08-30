package com.galaxy.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.galaxy.HelloWorld;

@SuppressWarnings("deprecation")
public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		HelloWorld bean1=(HelloWorld)factory.getBean("bean");
		HelloWorld bean2=(HelloWorld)factory.getBean("bean");
		System.out.println(bean1.equals(bean2));	
	}

}
