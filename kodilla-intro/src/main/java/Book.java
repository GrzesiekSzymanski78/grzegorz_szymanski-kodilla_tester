public class Book {
    private String author;
    private String title;

    private static Book of(String author, String title){
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public static void main(String[] args) {
        Book book = Book.of("Franz Kafka","The Trial");
        Book book1 = Book.of("Albert Camus", "The Plague");
        System.out.println("Author: " + book.author + "\nTitle: " + book.title);
        System.out.println("Author: " + book1.author + "\nTitle: " + book1.title);
    }
}