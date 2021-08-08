package com.kodilla.collections.adv.immutable.homework;

public class TaskApplication {
    public static void main(String[] args) {

        Task task = new Task("programming", 30);
        System.out.println("Name of task: " + task.getTitle() + ", Time in minutes: " + task.getDuration());
    }
}