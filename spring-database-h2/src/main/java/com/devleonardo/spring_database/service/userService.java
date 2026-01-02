package com.devleonardo.spring_database.service;

import com.devleonardo.spring_database.domain.dto.UserRequest;
import com.devleonardo.spring_database.domain.entity.UserEntity;
import com.devleonardo.spring_database.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {

    @Autowired
    private UserRepository UserRepository;

    public String showName(String nome){
        return nome;
    }

    public UserEntity criar(UserEntity UserEntity){
        return UserRepository.save(UserEntity);
    }

    public List<UserEntity> listar(){
        return UserRepository.findAll();
    }

    public UserEntity alterar(long id){
        UserEntity user =  UserRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
        return user;
    }

    public String remover(long id){
        UserRepository.deleteById(id);
        return "Usuário " + id + ", removido com sucesso";
    }



}
