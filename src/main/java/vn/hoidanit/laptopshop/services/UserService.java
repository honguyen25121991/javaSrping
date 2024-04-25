package vn.hoidanit.laptopshop.services;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handleHello() {
        return "Hello form User Service";
    }

    public User handleUserSaved(User user) {
        User createUser = this.userRepository.save(user);
        return createUser;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User getUserById(long id) {
        return this.userRepository.getUserById(id);
    }

    public User deleteUserById(long id) {
        return this.userRepository.deleteById(id);
    }
    // public User updateUser(Long id, User user) {
    // return this.userRepository.update(id, user);
    // }
}
