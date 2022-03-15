package day18.controller;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findByEmail(String email);

    void saveUser(User user);


}
