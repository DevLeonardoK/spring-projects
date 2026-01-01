package com.devleonardo.first_spring_java.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String nome;
    private String sexo;
    private int idade;

    // -- Para criar construtor - usar LOMBOK --//
//    public String getNome(String nome){
//        return nome;
//    }
//
//    public String getSexo(String sexo){
//        return sexo;
//    }
//
//    public int getIdade(int idade){
//        return idade;
//    }
//
//    public void setNome(String nome){
//        this.nome = nome;
//    }
//
//    public void setSexo(String sexo){
//        this.sexo = sexo;
//    }
//
//    public void setIdade(int idade){
//        this.idade = idade;
//    }

}
