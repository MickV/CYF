package com.cyf.cyfback.repository;

import com.cyf.cyfback.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
