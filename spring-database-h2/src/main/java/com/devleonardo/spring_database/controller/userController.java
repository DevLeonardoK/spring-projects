package com.devleonardo.spring_database.controller;

import com.devleonardo.spring_database.domain.User;
import com.devleonardo.spring_database.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class userController {

    @Autowired
    private userService userService;

    @GetMapping("/user")
    public String getUsername(){
        return userService.showName("Leonardo");
    }

    @PostMapping("/user/{id}")
    public String userPost(@PathVariable("id") String id ,@RequestBody User user, @RequestParam(value = "filter", defaultValue = "Nenhum filtro") String filtro){
        String userCompleto = user.getNome() + " - " + user.getIdade() + " - " + user.getSenha() + " --> " + id + " --> Filtro: " + filtro;
        return userCompleto;
    }


}
