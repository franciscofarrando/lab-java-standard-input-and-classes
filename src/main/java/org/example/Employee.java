package org.example;

public class Employee {
    private String name;
    private String email;
    private int age;
    private int salary;

//Metodo constructor
public Employee(int age, String email, String name) {
    this.age = age;
    this.email = email;
    this.name = name;
}
    public Employee(int salary, int age, String email, String name) {
        this.salary = salary;
        this.age = age;
        this.email = email;
        this.name = name;
    }

//Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

//Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
