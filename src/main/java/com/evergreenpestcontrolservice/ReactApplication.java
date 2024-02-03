package com.evergreenpestcontrolservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class , SecurityAutoConfiguration.class})
@ComponentScan("com.evergreenpestcontrolservice")
public class ReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactApplication.class, args);
	}

	
	
	/*
	 * @Bean public CommandLineRunner commandlinner(ApplicationContext apt ) {
	 * return args -> { System.out.println("Lets Goo Boys "); String[] beanNames =
	 * apt.getBeanDefinitionNames(); Arrays.sort(beanNames); for (String beanName :
	 * beanNames) { System.out.println(beanName); } };
	 * 
	 * }
	 */
}
