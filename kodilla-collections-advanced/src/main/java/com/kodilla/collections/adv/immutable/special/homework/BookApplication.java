package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();
        bookManager.createBook("Punishment and Crime", "Fyodor Dostoevsky");
        bookManager.createBook("The girl with the dragoon tattoo", "Stieg Larsson");
        bookManager.createBook("The Snowman", "Jo Nesbo");
        bookManager.createBook("The Snowman", "Jo Nesbo");
        bookManager.createBook("The girl with the dragoon tattoo","Stieg Larsson");
        bookManager.createBook("Punishment and Crime", "Fyodor Dostoevsky");
        System.out.println(bookManager.getBooks());

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Punishment and Crime", "Fyodor Dostoevsky"));
        bookList.add(new Book("Punishment and Crime", "Fyodor Dostoevsky"));
        bookList.add(new Book("The girl with the dragoon tattoo", "Stieg Larsson"));
        bookList.add(new Book("The girl with the dragoon tattoo", "Stieg Larsson"));
        bookList.add(new Book("The Snowman", "Jo Nesbo"));
        bookList.add(new Book("The Snowman", "Jo Nesbo"));

        for (int i = 0; i < bookManager.getBooks().size(); i++) {
            for (int j = 0; j < bookList.size(); j++) {
                bookManager.getBooks().get(i).equals(bookList.get(j));
                j++;
            }
            i++;
        }
    }
}