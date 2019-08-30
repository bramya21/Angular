package com.example.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("BeanConfiguration.xml"));
		Student myBean=(Student)beanFactory.getBean("StudentProxy");
		myBean.printName();
		System.out.println("*********");
		myBean.printCourse();
		System.out.println("*********");
		myBean.printRollno();
		System.out.println("*********");
		myBean.printThrowException();
	}

}
