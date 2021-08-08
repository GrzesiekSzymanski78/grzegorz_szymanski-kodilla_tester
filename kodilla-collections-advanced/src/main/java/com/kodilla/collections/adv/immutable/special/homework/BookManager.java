package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private static List<Book> books = new ArrayList<>();

    public static void createBook(String title, String author){
        System.out.println("Create book: " + title +", " + author);
        Book book = new Book(title,author);
        if(!exist(book)){
            books.add(book);
        }
    }

    private static boolean exist (Book book){
        return books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}