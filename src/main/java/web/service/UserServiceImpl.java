package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;

import web.model.User;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    private final List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(String mail) {
        return userDao.getUser(mail);

    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
    }

    public void deleteUser() {

    }

    public void deleteUser(String mail) {
        userDao.deleteUser(mail);

    }

}


