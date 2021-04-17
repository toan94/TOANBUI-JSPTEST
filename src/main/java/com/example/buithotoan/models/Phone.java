package com.example.buithotoan.models;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {
    private int Id;
    private String name;
    private String brand;
    private String description;
    private int price;


    public Phone(String name, String brand, String description, int price) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
    }



    public Phone(){}


    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Id")
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
