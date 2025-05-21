package com.Security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Security.model.UserCredential;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Long> {
    Optional<UserCredential> findByEmail(String email);
}
