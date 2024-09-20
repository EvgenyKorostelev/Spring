package ru.korostelev.DZSem5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.korostelev.DZSem5.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
