package com.devleonardo.first_spring_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//Essa annotation representa isso:
//@Configuration - metodos beans
//EnableAutoConfiguration - configurações automaticas
//ComponentScan - permite o spring verificar todo o pacote

//@Profile("dev")
public class FirstSpringJavaApplication {
//Nome do projeto + 'Application'
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringJavaApplication.class, args);
	}

}
