package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("Employee Details:");
		System.out.println("*********************");
		System.out.println("Name: "+ emp.getEname());
		System.out.println("Role: "+ emp.getRole());
		System.out.print("Address: "+ emp.getAddress().getCity());
		System.out.print("-"+emp.getAddress().getPincode());
	}
}
