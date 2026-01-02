package com.devleonardo.spring_database.controller;

import com.devleonardo.spring_database.domain.dto.UserRequest;
import com.devleonardo.spring_database.domain.entity.UserEntity;
import com.devleonardo.spring_database.repository.UserRepository;
import com.devleonardo.spring_database.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping
public class userController {

    @Autowired
    private userService userService;
    @Autowired
    private UserRepository userRepository;

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
        user.setAdmin(userRequest.getAdmin());

        return userService.criar(user);
    }

    @GetMapping("/usuario")
    public List<UserEntity> listar(){
        return userService.listar();
    }

    @PutMapping("/usuario/{id}")
    public UserEntity alterar(@PathVariable("id") long id, @RequestBody UserRequest user){
        UserEntity userEntity = userService.alterar(id);
        if (user.getNome() != null)
            userEntity.setNome(user.getNome());

        if (user.getIdade() != null)
            userEntity.setIdade(user.getIdade());

        if (user.getEmail() != null)
            userEntity.setEmail(user.getEmail());

        if (user.getAdmin() != null)
            userEntity.setAdmin(user.getAdmin());
        userRepository.save(userEntity);
        return userEntity;
    }

    @DeleteMapping("/usuario/{id}")
    public String remover(@PathVariable("id") long id){
        return userService.remover(id);

    }


}
