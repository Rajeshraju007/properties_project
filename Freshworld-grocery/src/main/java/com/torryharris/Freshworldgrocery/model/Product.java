package com.torryharris.Freshworldgrocery.model;

import javax.persistence.*;

@Entity
@Table(name="fruits")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pc;
    @Column(name = "Name")
    private String name;
    @Column(name = "Qty")
    private int qty;
    @Column(name = "Price")
    private double price;

    public Product() {
    }

    public Product(int pc, String name, int qty, double price) {
        this.pc = pc;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public Product(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pc=" + pc +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
