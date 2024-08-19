package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User findById(Long id);

    void save(User user);

    void saveAll(List<User> users);

    void update(User updatedUser);

    void delete(Long id);

    User findByUsername(String username);
}
