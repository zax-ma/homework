package warandpeace.dto;

/**
 * Класс для получения данных о пути и имени файла, из которого необходимо получить текст для дальнейшей обработки
 */
public class Book {

    private static String bookPath;

    private static String bookName;

    private static String bookPathName;

    private static String content;

    public Book(String bookPath){
        this.bookPath = bookPath;
    }
    public Book(String bookPath, String bookName) {
        this.bookPath = bookPath;
        this.bookName = bookName;
    }

    public static String getBookPath() {
        return bookPath;
    }

    public static String getBookName(){
        return bookName;
    }

    public static String getBookPathName() {
        return bookPath + bookName;
    }


    @Override
    public String toString() {
        return bookPath + bookName;

    }
}
