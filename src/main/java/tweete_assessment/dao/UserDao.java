package tweete_assessment.dao;

import tweete_assessment.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findByEmail(String email);

    void saveUser(User user);


}
