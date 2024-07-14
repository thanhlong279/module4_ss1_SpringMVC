package com.example.pr2managercustomer.models;

public class Customer {
    private long id;
    private String name;
    private String email;
    private String address;

    public Customer(String address, String email, long id, String name) {
        this.address = address;
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public Customer(){}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
