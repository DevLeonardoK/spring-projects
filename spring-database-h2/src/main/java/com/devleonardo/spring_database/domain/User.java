package com.devleonardo.spring_database.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    String nome;
    int idade;
    String senha;
}
