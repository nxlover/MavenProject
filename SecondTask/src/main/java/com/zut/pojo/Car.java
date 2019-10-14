package com.zut.pojo;

public class Car {
    private String color;
    private String brand;
    private String displacement;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public Car(String color, String brand, String displacement) {
        this.color = color;
        this.brand = brand;
        this.displacement = displacement;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", displacement='" + displacement + '\'' +
                '}';
    }
}
