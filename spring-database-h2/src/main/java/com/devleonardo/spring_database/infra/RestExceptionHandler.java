package com.devleonardo.spring_database.infra;

import com.devleonardo.spring_database.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice // Controla as exceptions
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class) // Serve para o spring identificar a exception
    private ResponseEntity<RestErrorMessage> userNotFoundHandler(UserNotFoundException exception){
        RestErrorMessage errorMessageResponse = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessageResponse);
    }
}
