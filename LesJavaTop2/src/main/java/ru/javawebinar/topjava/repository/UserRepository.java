package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.User;

import java.util.Collection;
import java.util.List;

/** LoggedUser add or delete user rest from controller work with repo */
public interface UserRepository {
    User save(User user);

    // false if not found
    boolean delete(int id);

    // null if not found 404
    User get(int id);

    // null if not found
    User getByEmail(String email);

    /**LoggedUser for admin */
    Collection<User> getAll();
}