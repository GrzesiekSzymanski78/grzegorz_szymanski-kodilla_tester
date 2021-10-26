package com.kodilla.abstracts.homework;

public class JobApp {

    public static void main(String[] args) {

        Programmer programmer = new Programmer(8000, "software development");
        Tester tester = new Tester(5000, "performing tests");
        BusinessAnalyst businessAnalyst = new BusinessAnalyst(10000,
                "analysis and creation of requirements");

        Person person = new Person("John", 35, programmer);
        Person person1 = new Person("Alice", 26, tester);
        Person person2 = new Person("Kate", 39, businessAnalyst);

        printParameters(person, programmer.displayResponsibilities(), programmer.getSalary());
        printParameters(person1, tester.displayResponsibilities(),
                tester.getSalary());
        printParameters(person2, businessAnalyst.displayResponsibilities(),
                businessAnalyst.getSalary());
    }

    private static void printParameters(Person person, String s, double salary) {
        person.getJob().getResponsibilities();
        System.out.println();
        System.out.println("First name: " + person.getFirstName() + "\nage: "
                + person.getAge() + "\njob: " + person.getJob() + "\nresponsibilities: "
                + s + "\nsalary: " + salary);
    }
}