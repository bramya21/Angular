package com.lifecycle.test;
import com.lifecycle.src.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class TestLifeCycle {
	public static void main(String args[])
	{
		/*BeanFactory factory=new XmlBeanFactory(new ClassPathResource("lifecyclebeans.xml"));
		HelloWorld us=(HelloWorld)factory.getBean("b");
		us.getMessage();*/
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclebeans.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("b");
	      obj.getMessage();
	      context.registerShutdownHook();
	}
}
