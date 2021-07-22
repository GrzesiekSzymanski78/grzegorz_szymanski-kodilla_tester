public class BookApp {
    public static void main(String[] args) {
        Book book = Book.of("Franz Kafka","The Trial");
        Book book1 = Book.of("Albert Camus", "The Plague");
        System.out.println("Author: " + book.getAuthor() + "\nTitle: " + book.getTitle());
        System.out.println("Author: " + book1.getAuthor() + "\nTitle: " + book1.getTitle());
    }
}