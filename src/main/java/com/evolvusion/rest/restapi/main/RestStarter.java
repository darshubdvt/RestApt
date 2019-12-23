package com.evolvusion.rest.restapi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.evolvusion.rest.restapi.repository.EmployeeRepository;

@SpringBootApplication
@ComponentScan("com.evolvusion.rest.restapi")
@Configuration
//@EnableTransactionManagement
@EnableJpaRepositories("com.evolvusion.rest.restapi.repository")
@EntityScan("com.evolvusion.rest.restapi.bean")
@PropertySource("classpath:application.properties")
//@EnableJpaRepositories("com.evolvusion.rest.restapi.repository")
public class RestStarter {
	public static void main(String[] args) {
		SpringApplication.run(RestStarter.class, args);
	}
}
