package dev.app.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import dev.app.server.entities.User;

@Repository
public interface userRepository extends JpaRepository<User, Long> {

	User getById(Long id);

}
