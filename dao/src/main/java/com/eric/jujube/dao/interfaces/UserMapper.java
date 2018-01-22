package com.eric.jujube.dao.interfaces;

import com.eric.jujube.dao.objects.User;
import org.springframework.dao.DataAccessException;

public interface UserMapper {

    public void put (User user) throws DataAccessException;
    public User get(String userId) throws DataAccessException;
    public void delete(String userId) throws DataAccessException;
}
