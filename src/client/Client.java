package client;
import beans.Question;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("injections/configure.xml");
		BeanFactory bfac = new XmlBeanFactory(resource);
		Question question = (Question)bfac.getBean("question");
		question.printQuestion();
	}

}
