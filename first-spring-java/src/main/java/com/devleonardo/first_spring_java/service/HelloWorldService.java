package com.devleonardo.first_spring_java.service;
//Services contém as regras de negócio, a lógica
//Controller recebe a requisicao e passa para 'services' o trabalho

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name){
        return "Hello World " + name;
    }
}
