package ru.korostelev.DZSem6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.korostelev.DZSem6.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
}
