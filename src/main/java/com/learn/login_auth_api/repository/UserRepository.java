package com.learn.login_auth_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.login_auth_api.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}