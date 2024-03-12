package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LaptopshopApplication.class, args);

		// Get the names of all the beans in the application context
		// String[] beanNames = context.getBeanDefinitionNames();

		// Print the names of all the beans
		// for (String beanName : beanNames) {
		// System.out.println(beanName);
		// }
	}

}
