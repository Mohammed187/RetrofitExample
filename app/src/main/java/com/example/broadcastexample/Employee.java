package com.example.broadcastexample;

public class Employee {
    private String username;

    private Integer age;

    private String mail;

    public Employee(String username, Integer age, String mail) {
        this.username = username;
        this.age = age;
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }
}
