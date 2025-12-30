package bookPractice;

public class PrintBookExt  extends Book{
    private String publisher;
    private String isbn;

    public PrintBookExt(String bookTitle, int yearOfPublication, String author,  String publisher,  String isbn) {
        super(bookTitle, yearOfPublication, author);
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("%s%nPublisher: %s%nISBN: %s%n", super.toString(),publisher,isbn);
    }
}
