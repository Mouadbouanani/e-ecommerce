package com.ecommerce.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
@PrimaryKeyJoinColumn(name = "user_id")
public class Client extends Users {

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Cart cart;

    public Client() {
        this.setRole("CLIENT");
    }

    public Client(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password, "CLIENT");
    }

    // Getters and Setters
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}