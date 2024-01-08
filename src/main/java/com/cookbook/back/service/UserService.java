package com.cookbook.back.service;

import com.cookbook.back.domain.User;

public interface UserService {

    Iterable<User> findAll();
}
