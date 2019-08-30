package car.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.car.model.Model;


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("carbeans.xml"));
		Model us=(Model)factory.getBean("model1");
		System.out.println(us);
	}

}
