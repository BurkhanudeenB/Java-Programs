package com.example.userregistrationapi.controller;

public class Person {
    private String name;
    private int age;

    // Constructor with all parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with default age
    public Person(String name) {
        this(name, 30); // Calling the constructor with two parameters
    }

    // Default constructor
    public Person() {
        this("Unknown"); // Calling the constructor with one parameter
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob");
        Person person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}