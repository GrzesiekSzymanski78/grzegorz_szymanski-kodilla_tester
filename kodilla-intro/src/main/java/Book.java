public class Book {

    private String author;
    private String title;

    public static Book of(String author, String title){
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}