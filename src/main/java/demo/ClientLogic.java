package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		WelcomeBean bean = (WelcomeBean) context.getBean("welcomeBean");
		bean.show();

	}

}
