package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserModel findByUsername(String username);

}
