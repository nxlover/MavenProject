package com.zut.pojo;

public class Boss {
    private String name;
    private String corporation;
    private String hobby;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Boss(String name, String corporation, Car car, String hobby) {
        this.name = name;
        this.corporation = corporation;
        this.car = car;
        this.hobby = hobby;
    }

    public Boss() {
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", corporation='" + corporation + '\'' +
                ", car=" + car +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
