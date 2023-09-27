package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserService {

    User getUser(String mail);

    void addUser(User user);

    void deleteUser(String mail);

    List<User> getAllUsers();

    void updateUser(User user);


}
