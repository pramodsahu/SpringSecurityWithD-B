package com.techpointers.security.securitydbexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techpointers.security.securitydbexample.model.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
