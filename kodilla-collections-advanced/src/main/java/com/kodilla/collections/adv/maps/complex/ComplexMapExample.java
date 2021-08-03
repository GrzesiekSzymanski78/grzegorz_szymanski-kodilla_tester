package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> shool = new HashMap<>();
        Student john = new Student("John", "Stevenson");
        Student jessie = new Student("Jessie", "Pinkman");
        Student bart = new Student("Bart", "Simpson");

        Grades johnGrades = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);
        Grades jessieGrades = new Grades(2.5, 3.0, 2.0);
        Grades bartGrades = new Grades(4.0, 4.0, 4.0, 4.0, 5.0);

        shool.put(john, johnGrades);
        shool.put(jessie, jessieGrades);
        shool.put(bart, bartGrades);

        System.out.println(shool.get(john));

        for (Map.Entry<Student,Grades> studentEntry : shool.entrySet())
            System.out.println(studentEntry.getKey().getFirstName() + ", average: " +
                    studentEntry.getValue().getAverage());
    }
}