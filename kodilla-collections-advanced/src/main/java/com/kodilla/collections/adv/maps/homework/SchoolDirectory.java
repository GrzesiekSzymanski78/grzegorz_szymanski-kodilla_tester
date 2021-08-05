package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schoolPrincipalHashMap = new HashMap<>();

        School sSch = new School("Secondary School Chicago", 20,25,22,23);
        School sSd = new School("Secondary School Detroit", 30,25,28,24);
        School sSn = new School("Secondary School New York", 24,29,23,26);

        Principal sSchPrincipal = new Principal("John", "Travolta");
        Principal sSdPrincipal = new Principal("Uma", "Thurman");
        Principal sSPrincipal = new Principal("Kevin", "Costner");

        schoolPrincipalHashMap.put(sSch, sSchPrincipal);
        schoolPrincipalHashMap.put(sSd, sSdPrincipal);
        schoolPrincipalHashMap.put(sSn, sSPrincipal);

        for (Map.Entry<School, Principal> schoolPrincipalEntry : schoolPrincipalHashMap.entrySet())
            System.out.println("School director: " + schoolPrincipalEntry.getValue().getFirstName() + " " +
                    schoolPrincipalEntry.getValue().getSecondName() + ", School name: "
                    + schoolPrincipalEntry.getKey().getSchoolName() +
                    ", Number of students: " + schoolPrincipalEntry.getKey().getNumberOfStudents());
    }
}