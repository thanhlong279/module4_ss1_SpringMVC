package com.example.ex1_money_conversion.models;

public class Student {
    private int id;
    private String name;
    private String address;
    private float point;


    public Student(int id, String name, String address, float point) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.point = point;
    }

    public Student(String name, String address, float point) {
        this.name = name;
        this.address = address;
        this.point = point;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
}
