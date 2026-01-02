package com.devleonardo.spring_database.service;

import com.devleonardo.spring_database.domain.entity.UserEntity;
import com.devleonardo.spring_database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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



}
