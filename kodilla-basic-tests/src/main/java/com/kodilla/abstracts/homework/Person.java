package com.kodilla.abstracts.homework;

public class Person {

    public String firstName, job;
    private int age;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
        return;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }
}