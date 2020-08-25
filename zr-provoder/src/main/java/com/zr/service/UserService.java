package com.zr.service;

import com.zr.bean.User;
import com.zr.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findById(Long id){
        return userDao.selectByPrimaryKey(id);
    }
}
