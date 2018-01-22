package com.eric.jujube.dao.impl;

import com.eric.jujube.dao.interfaces.UserMapper;
import com.eric.jujube.dao.objects.User;

import org.springframework.dao.DataAccessException;

public class UserMapperImpl implements UserMapper{

    public void put(User user) throws DataAccessException {

    }

    public User get(String userId) throws DataAccessException {
        return null;
    }

    public void delete(String userId) throws DataAccessException {

    }
}
