package ru.ruslanator.springlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ruslanator.springlearning.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
