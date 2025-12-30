package bookPractice;

public class AudioBook extends Book {
    private double sizeInMb;
    private double playLength;
    private String playBackArtist;

    public AudioBook(String bookTitle, int yearOfPublication, String author,
                     double sizeInMb,  double playLength, String playBackArtist) {
        super(bookTitle, yearOfPublication, author);
        this.sizeInMb = sizeInMb;
        this.playLength = playLength;
        this.playBackArtist = playBackArtist;
    }

    public double getSizeInMb() {
        return sizeInMb;
    }

    public double getPlayLength() {
        return playLength;
    }

    public String getPlayBackArtist() {
        return playBackArtist;
    }

    @Override
    public String toString() {
        return String.format("%s%n Size: %.2f MB%n Length %.2f hours %n Narrator: %s",
                super.toString(),sizeInMb, playLength, playBackArtist);
    }
}
