package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Integer> numberOfStudentsInClasses = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, int... numberOfStudentsInClasses) {
        this.schoolName = schoolName;
        for (int numberOfStudents : numberOfStudentsInClasses)
            this.numberOfStudentsInClasses.add(numberOfStudents);
    }

    public int getNumberOfStudents() {
        int sum = 0;
        for (int classes : numberOfStudentsInClasses)
            sum += classes;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudentsInClasses=" + numberOfStudentsInClasses +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(numberOfStudentsInClasses, school.numberOfStudentsInClasses)
                && Objects.equals(schoolName, school.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStudentsInClasses, schoolName);
    }
}