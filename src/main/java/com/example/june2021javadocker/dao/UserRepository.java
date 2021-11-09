package com.example.june2021javadocker.dao;

import com.example.june2021javadocker.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
