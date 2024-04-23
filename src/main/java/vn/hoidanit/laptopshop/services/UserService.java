package vn.hoidanit.laptopshop.services;

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
}
