package com.noteapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user", schema = "public")
public class User {
    @Id
    private Long user_id;

    private String username;
    private String password;
    private String role;
}
