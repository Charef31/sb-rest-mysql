package com.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.formation.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}