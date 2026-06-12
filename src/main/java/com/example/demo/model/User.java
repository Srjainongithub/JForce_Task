package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email; // new field add 
    private String password;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

// for my reference

// for run the program command is paste on terminal

// pwershell stop the current process command
// Stop-Process -Id (Get-NetTCPConnection -LocalPort 8081).OwningProcess -Force
// ./mvnw spring-boot:run

// check the program on browser
// http://localhost:8081/login
// http://localhost:8081/register
// http://localhost:8081/feedback
// database connection
// jdbc:mysql://localhost:3306/feedback_app
// username: root
// password: 1234
// database name: feedback_db
// database table name: user, feedback
//