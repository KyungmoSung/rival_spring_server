package com.rival.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringMvcApplication.class, args);
	}
}