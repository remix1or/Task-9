package com.salimov.web.service;

import com.salimov.web.dao.UserDao;
import com.salimov.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) {
    userDao.addUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
    userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
    userDao.deleteUser(id);
    }
}
