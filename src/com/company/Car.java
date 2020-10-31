package com.company;

public class Car {
    private String name;
    public static int wheels = 4;
    public static final int POWER = 150;



    public void doSmth() {
        System.out.println("Static method!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
