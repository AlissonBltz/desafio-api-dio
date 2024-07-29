package me.dio.service;

import me.dio.domain.model.User;
import java.util.List;
public interface UserService {

    User findById(Long id);
    List<User> findAll(User user);
    User create(User userToCreate);
    ser deleteById(Long id);
}
