package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();
        bookManager.createBook("Punishment and Crime", "Fyodor Dostoevsky");
        bookManager.createBook("The girl with the dragoon tattoo", "Stieg Larsson");
        bookManager.createBook("The Snowman", "Jo Nesbo");
        bookManager.createBook("The Snowman", "Jo Nesbo");
        System.out.println(bookManager.getBooks());

        Book b1 = new Book("Punishment and Crime", "Fyodor Dostoevsky");
        Book b2 = new Book("Punishment and Crime", "Fyodor Dostoevsky");
        Book b3 = new Book("The girl with the dragoon tattoo","Stieg Larsson");
        Book b4 = new Book("The girl with the dragoon tattoo","Stieg Larsson");
        Book b5 = new Book("The Snowman", "Jo Nesbo");
        Book b6 = new Book("The Snowman", "Jo Nesbo");
        System.out.println("Compare addresses: " + (b1 == b2));
        System.out.println("b3.equals(b4): " + b3.equals(b4));
        System.out.println("b5.equals(b6): " + b5.equals(b6));
    }
}