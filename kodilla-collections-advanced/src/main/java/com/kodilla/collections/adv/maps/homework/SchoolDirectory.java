package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schoolPrincipalHashMap = new HashMap<>();

        School firstSchool = new School("Secondary School Chicago", 20,25,22,23);
        School secondSchool = new School("Secondary School Detroit", 30,25,28,24);
        School thirdSchool = new School("Secondary School New York", 24,29,23,26);

        Principal firstSchoolPrincipal = new Principal("John", "Travolta");
        Principal secondSchoolPrincipal = new Principal("Uma", "Thurman");
        Principal thirdSchoolPrincipal = new Principal("Kevin", "Costner");

        schoolPrincipalHashMap.put(firstSchool, firstSchoolPrincipal);
        schoolPrincipalHashMap.put(secondSchool, secondSchoolPrincipal);
        schoolPrincipalHashMap.put(thirdSchool, thirdSchoolPrincipal);

        for (Map.Entry<School, Principal> schoolPrincipalEntry : schoolPrincipalHashMap.entrySet())
            System.out.println("School director: " + schoolPrincipalEntry.getValue().getFirstName() + " " +
                    schoolPrincipalEntry.getValue().getSecondName() + ", School name: "
                    + schoolPrincipalEntry.getKey().getSchoolName() +
                    ", Number of students: " + schoolPrincipalEntry.getKey().getNumberOfStudents());
    }
}