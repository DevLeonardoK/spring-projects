package com.devleonardo.spring_database.service;

import com.devleonardo.spring_database.domain.entity.UserEntity;
import com.devleonardo.spring_database.exception.UserNotFoundException;
import com.devleonardo.spring_database.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

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
        UserEntity user =  UserRepository.findById(id).orElseThrow(UserNotFoundException::new);
        return user;
    }

    public String remover(long id){
        UserRepository.deleteById(id);
        return "Usuário " + id + ", removido com sucesso";
    }



}
