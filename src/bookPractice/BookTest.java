package bookPractice;

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book("Code practice",
                2005,
                "John Smith" );

        PrintBookExt printBook = new PrintBookExt("Arrays for Beginners",
                2020, "Caleb Cazak", "Agathon ACE",
                "445 - 123 - 87");

        AudioBook audio = new AudioBook("Read Coding",
                2024, "Salako Ibrahim",
                157.8, 2.30, "Ray Lion");

        System.out.println("==========BOOK==========");
        System.out.println(book);

        System.out.println("\n==========PRINT BOOK==========");
        System.out.println(printBook);

        System.out.println("\n==========AUDIO BOOK==========");
        System.out.println(audio);


    }

}
