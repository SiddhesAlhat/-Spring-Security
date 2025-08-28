package com.one.verification.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.one.verification.model.User;
import com.one.verification.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}