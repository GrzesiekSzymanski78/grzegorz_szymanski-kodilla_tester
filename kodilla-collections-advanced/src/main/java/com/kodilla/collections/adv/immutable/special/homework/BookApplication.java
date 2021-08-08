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
        System.out.println("Compare addresses: " + (b1 == b2));
    }
}