package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
public class LaptopShopApplication {

    public static void main(String[] args) {
        // ApplicationContext context =
        // SpringApplication.run(LaptopshopApplication.class, args);
        SpringApplication.run(LaptopShopApplication.class, args);

        // Get the names of all the beans in the application context
        // String[] beanNames = context.getBeanDefinitionNames();

        // Print the names of all the beans
        // for (String beanName : beanNames) {
        // System.out.println(beanName);
        // }
    }

}
