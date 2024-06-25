package com.example.demo;

public class User {
    public String name;
    public String surname;
    public int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "\n" + surname + "\n" + age;
    }
}
