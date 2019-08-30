package com.dept.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.dept.src.Employee;
public class DeptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("dept.xml"));
		Employee us=(Employee)factory.getBean("emp");
		us.printDept();
	}

}
