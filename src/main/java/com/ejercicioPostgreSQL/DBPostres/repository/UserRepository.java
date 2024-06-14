package com.ejercicioPostgreSQL.DBPostres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicioPostgreSQL.DBPostres.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
