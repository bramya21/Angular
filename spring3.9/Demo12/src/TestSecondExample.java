import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestSecondExample {

		public static void main(String[] args)
		{
			BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
			SecondExample bean1=(SecondExample) factory.getBean("bean1");
			bean1.sayHi();
		}
}
