package com.ecommerce.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "fournisseurs")
@PrimaryKeyJoinColumn(name = "user_id")
public class Fournisseur extends Users {

    @OneToMany(mappedBy = "fournisseur", cascade = CascadeType.ALL)
    private List<Product> products;

    public Fournisseur() {
        this.setRole("FOURNISSEUR");
    }

    public Fournisseur(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password, "FOURNISSEUR");
    }

    // Getters and Setters
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}