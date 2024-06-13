package com.ejercicioPostgreSQL.DBPostres;

import com.ejercicioPostgreSQL.DBPostres.exception.UserNotFoundException;
import com.ejercicioPostgreSQL.DBPostres.model.User;

import java.util.Optional;

public class UserRepository {
    public User save(User user) {
        return user;
    }

    public Optional<User> findById(Long id) {
        Optional<User> user = Optional.empty();
        return user;
    }
}
