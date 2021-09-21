package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BookControllerTest {

    private BookService bookServiceMock = Mockito.mock(BookService.class);
    private BookController bookController = new BookController(bookServiceMock);

    @Test
    public void shouldFetchBooks() {
        //given
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook() {
        //given
        BookDto bookDto = new BookDto("The Sirens of Titan","Kurt Vonnegut");
        //when
        bookController.addBook(bookDto);
        //then
        Mockito.doNothing().when(bookServiceMock).addBooks(bookDto);
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBooks(bookDto);
    }
}