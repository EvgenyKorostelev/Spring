package ru.korostelev.DZSem4.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.korostelev.DZSem4.entity.User;
import ru.korostelev.DZSem4.repository.UserRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImp implements UserService {

    private UserRepository usersRepository;


    public User addUser(User user) {
        return usersRepository.add(user);
    }

    @Override
    public List<User> findAllUsers() {
        return usersRepository.getAll();
    }

    @Override
    public User findUserById(Integer id) {
        return usersRepository.getById(id);
    }

    @Override
    public User updateUser(User oldUser, User updatedUser) {
        User user = new User(oldUser.getId(), updatedUser.getName(), updatedUser.getEmail());
        return usersRepository.add(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        usersRepository.delete(id);
    }
}
