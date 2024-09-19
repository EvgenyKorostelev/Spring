package ru.korostelev.DZSem4.service;

import ru.korostelev.DZSem4.entity.User;

import java.util.List;


public interface UserService {

    User addUser(User user);

    User findUserById(Integer id);

    User updateUser(User oldUser, User updatedUser);

    void deleteUserById(Integer id);

    List<User> findAllUsers();
}
