package com.devleonardo.spring_database.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    //long id; --> Não define pois nao envia no json, se definir aqui vai dar erro, pois é gerado automaticamente
    String nome;
    Integer idade;
    String email;
    String senha;
    Boolean admin;
}
