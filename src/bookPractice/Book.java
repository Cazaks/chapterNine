package bookPractice;

public class Book {
    private String bookTitle;
    private int yearOfPublication;
    private String author;

    public Book(String bookTitle, int yearOfPublication, String author) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){
        return String.format("Title: %s%n Author: %s%n Year: %d", bookTitle, author, yearOfPublication);
    }
}
