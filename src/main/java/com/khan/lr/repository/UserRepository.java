package com.khan.lr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khan.lr.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}