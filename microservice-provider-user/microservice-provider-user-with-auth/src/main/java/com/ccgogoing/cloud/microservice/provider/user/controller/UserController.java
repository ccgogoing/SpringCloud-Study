package com.ccgogoing.cloud.microservice.provider.user.controller;

import com.ccgogoing.cloud.microservice.provider.user.dao.UserRepository;
import com.ccgogoing.cloud.microservice.provider.user.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




/**
 * 描述:
 *
 * @outhor chong
 * @create 2018-08-01 23:36
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {

        User findOne = this.userRepository.findOne(id);
        return findOne;
    }
}
