package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String userName;
    private int age;
    private int numberOfPost;
    private String group;

    public User(String userName, int age, int numberOfPost, String group) {
        this.userName = userName;
        this.age = age;
        this.numberOfPost = numberOfPost;
        this.group = group;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && numberOfPost == user.numberOfPost && Objects.equals(userName, user.userName) && Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age, numberOfPost, group);
    }
}