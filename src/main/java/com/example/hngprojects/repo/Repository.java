package com.example.hngprojects.repo;

import com.example.hngprojects.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {
}
