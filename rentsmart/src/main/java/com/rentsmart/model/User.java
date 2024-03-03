package com.rentsmart.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int uid;

    @Column(name="fullname", length = 256, nullable = true)
    public String fullName;

    @Column(name="email", length = 45, nullable = true)
    public String email;

    @Column(name="phonenumber", length = 45, nullable = true)
    public String phoneNumber;

    @Column(name="dob", nullable = true)
    public Date dateOfBirth;

    @Column(name="password", nullable = true)
    public String password;
}
