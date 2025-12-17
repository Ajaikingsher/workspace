package com.ajai.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajai.learn.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
