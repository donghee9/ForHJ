package com.example.walkaryhj.repository;

import com.example.walkaryhj.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}