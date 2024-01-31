package com.todo.Note.repository;

import com.todo.Note.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    // Özel sorgular veya ek metotlar buraya eklenebilir.
//    User findByUserName(String username);

    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUserName(@Param("username") String username);
}
