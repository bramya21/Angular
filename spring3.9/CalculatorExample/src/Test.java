import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("calcbean.xml"));
		User us=(User)factory.getBean("user");
		us.add();
	}

}
