package com.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "admins")
@PrimaryKeyJoinColumn(name = "user_id")
public class Admin extends Users {

    public Admin() {
        this.setRole("ADMIN");
    }

    public Admin(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password, "ADMIN");
    }
}