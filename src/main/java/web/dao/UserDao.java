package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void create(User user);

    void update(User user);

    void delete(int id);

    User findById(int id);

    List<User> findAll();
}
