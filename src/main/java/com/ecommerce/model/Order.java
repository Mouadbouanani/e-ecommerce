package com.ecommerce.model;



import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders") // Avoid conflicts with SQL reserved word "Order"
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Each order belongs to one client
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    // An order can contain multiple products
    @OneToMany
    private List<Product> productList;

    private double totalPrice;
    private String status; // e.g., "Pending", "Completed", "Cancelled"

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public List<Product> getProductList() { return productList; }
    public void setProductList(List<Product> productList) { this.productList = productList; }

    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

