package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.userEntity;
import com.example.demo.userRepository1;

import java.util.List;
import java.util.Optional;

@Service
public class userService {

    @Autowired
    private userRepository1 userRepository;

    public List<userEntity> findAll() {
        return userRepository.findAll();
    }

    public Optional<userEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    public userEntity save(userEntity user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}