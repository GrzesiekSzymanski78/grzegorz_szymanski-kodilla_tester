package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = initStudents();
        for (Student student : students) {
            print(student);
        }
    }

    private static void print(Student student) {
        System.out.println("student: " + student.getName()  + ", teacher: " + student.getTeacher(student));
    }

    private static List<Student> initStudents() {
        Teacher teacher1 = new Teacher("Robert Smith");
        Teacher teacher2 = new Teacher("Peter Murphy");
        Teacher teacher3 = new Teacher("James Hetfield");

        List<Student> students = new ArrayList<>();
        students.add(new Student("John Snow", null));
        students.add(new Student("Kate Kinley", teacher3));
        students.add(new Student("Kim Novak", teacher1));
        students.add(new Student("Kevin Haskins", teacher2));
        students.add(new Student("Steven Tyler", null));
        return students;
    }
}