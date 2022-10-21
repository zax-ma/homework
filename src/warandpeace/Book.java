package warandpeace;

public class Book {

    private static String bookFile;
    public Book(String bookFile) {
        this.bookFile = bookFile;
    }


    public static String getBookFile() {
        return bookFile;
    }

    public static void setBookFile(String bookFile) {
        Book.bookFile = bookFile;
    }

    @Override
    public String toString() {
        return bookFile;

    }
}
