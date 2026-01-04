package com.devleonardo.spring_database.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

//Classe de erro padrão
@AllArgsConstructor
@Getter
@Setter
public class RestErrorMessage {
    private HttpStatus status;
    private String message;

}
