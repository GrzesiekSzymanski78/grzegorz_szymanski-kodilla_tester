package com.kodilla.abstracts.homework;

public class JobApp {

    public static void main(String[] args) {

        Programmer programmer = new Programmer(8000, "software development");
        Person person = new Person("John", 35, "Programmer");
        programmer.getResponsibilities();
        System.out.println("First name: " + person.getFirstName() + "\nage: " + person.getAge() + "\njob: "
                + person.getJob() + "\nresponsibilities: " + programmer.displayResponsibilities() + "\nsalary: "
                + programmer.getSalary());

        Tester tester = new Tester(5000, "performing tests");
        Person person1 = new Person("Alice", 26, "Tester");
        tester.getResponsibilities();
        System.out.println();
        System.out.println("First name: " + person1.getFirstName() + "\nage: " + person1.getAge() + "\njob: "
                + person1.getJob() + "\nresponsibilities: " + tester.displayResponsibilities() + "\nsalary: "
                + tester.getSalary());

        BusinessAnalyst businessAnalyst = new BusinessAnalyst(10000, "analysis and creation of requirements");
        Person person2 = new Person("Kate", 39, "Business Analyst");
        businessAnalyst.getResponsibilities();
        System.out.println();
        System.out.println("First name: " + person2.getFirstName() + "\nage: " + person2.getAge() + "\njob: "
                + person2.getJob() + "\nresponsibilities: " + businessAnalyst.displayResponsibilities() + "\nsalary: "
                + businessAnalyst.getSalary());
    }
}