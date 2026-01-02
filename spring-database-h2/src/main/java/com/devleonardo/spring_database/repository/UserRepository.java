package com.devleonardo.spring_database.repository;

import com.devleonardo.spring_database.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository serve para conexão com o banco de dados.
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}