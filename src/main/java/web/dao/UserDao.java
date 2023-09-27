package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void deleteUser(String mail);

    void updateUser(String email, String name, String lastname, String mail);

    List<User> getAllUsers();

    User getUser(String mail);
}
