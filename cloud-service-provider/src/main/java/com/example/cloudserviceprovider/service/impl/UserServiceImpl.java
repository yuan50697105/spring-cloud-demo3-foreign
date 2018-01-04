package com.example.cloudserviceprovider.service.impl;

import com.example.cloudserviceprovider.model.User;
import com.example.cloudserviceprovider.repository.UserRepository;
import com.example.cloudserviceprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User get(long id) {
        return userRepository.getById(id);
    }
}
