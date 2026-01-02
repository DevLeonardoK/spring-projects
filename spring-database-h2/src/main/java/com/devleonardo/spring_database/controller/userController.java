package com.devleonardo.spring_database.controller;

import com.devleonardo.spring_database.domain.dto.UserRequest;
import com.devleonardo.spring_database.domain.entity.UserEntity;
import com.devleonardo.spring_database.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String userPost(@PathVariable("id") String id , @RequestBody UserRequest user, @RequestParam(value = "filter", defaultValue = "Nenhum filtro") String filtro){
        String userCompleto = user.getNome() + " - " + user.getIdade() + " - " + user.getSenha() + " --> " + id + " --> Filtro: " + filtro;
        return userCompleto;
    }

    @PostMapping("/usuario")
    public UserEntity criar(@RequestBody UserRequest userRequest){
        UserEntity user = new UserEntity();
        user.setNome(userRequest.getNome());
        user.setIdade(userRequest.getIdade());
        user.setEmail(userRequest.getEmail());
        user.setSenha(userRequest.getSenha());
        user.setAdmin(userRequest.isAdmin());

        return userService.criar(user);
    }


}
