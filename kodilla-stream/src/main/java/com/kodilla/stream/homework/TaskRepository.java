package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("clean bathroom", LocalDate.of(2021, 8, 11),
                LocalDate.of(2021, 8, 14)));
        tasks.add(new Task("buy a new TV", LocalDate.of(2021, 8, 20),
                LocalDate.of(2021, 8, 31)));
        tasks.add(new Task("go to cinema",LocalDate.of(2021,7,30),
                LocalDate.of(2021,8,10)));
        tasks.add(new Task("pay the bills",LocalDate.of(2021,8,21),
                LocalDate.of(2021,8,30)));
        tasks.add(new Task("take wife to dinner",LocalDate.of(2021,8,20),
                LocalDate.of(2021,8,28)));
        return tasks;
    }
}