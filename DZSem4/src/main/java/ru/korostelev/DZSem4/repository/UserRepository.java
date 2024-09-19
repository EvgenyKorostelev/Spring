package ru.korostelev.DZSem4.repository;

import ru.korostelev.DZSem4.entity.User;
import ru.korostelev.DZSem4.repository.db.Repository;

import java.util.List;


public interface UserRepository extends Repository<User, Integer> {

    User add(User user);

    List<User> getAll();

    User getById(Integer id);

    void delete(Integer id);

}
