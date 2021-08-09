package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

	@Bean
	public Employee employee() {
		return new Employee("Karthik"," Java Developer",address());
	}
	
	@Bean
	public Address address() {
		return new Address("Chennai",600100);
	}
	
}
