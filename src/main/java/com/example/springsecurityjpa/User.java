package com.example.springsecurityjpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean active_status;
    private String user_password;
    private String user_name;
    private String roles;

    public boolean getActive_status() {
        return active_status;
    }
}
