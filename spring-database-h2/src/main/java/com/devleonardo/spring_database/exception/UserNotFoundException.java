package com.devleonardo.spring_database.exception;

public class UserNotFoundException extends RuntimeException{

    //Mensagem de erro padronizado
    public UserNotFoundException(){
        super("Usuário não encontrado no banco de dados. Verifique o identificador!");
    }

    //Mensagem de erro personalizada
    public UserNotFoundException(String message){
        super(message);
    }

}
