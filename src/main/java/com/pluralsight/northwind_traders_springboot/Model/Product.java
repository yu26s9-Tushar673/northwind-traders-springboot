package com.pluralsight.northwind_traders_springboot.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ProductID`")
    private Long productId;
    @Column(name = "`ProductName`")
    private String name;
    @Column(name = "`CategoryID`")
    private String category;
    @Column(name = "`UnitPrice`")
    private double price;

    public Product() {
    }

    public Product(Long productId, String name, String category, double price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public long getProductId() { return productId; }

    public void setProductId(Long productId) { this.productId = productId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }
}
