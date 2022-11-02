package warandpeace.filereaders;

import warandpeace.api.ISearchEngine;
import warandpeace.dto.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteResultToFile {

    /**
     * Метод, создающий новый файл в заданной директории, откуда берется книга для проверки
     * @param book объект класса Book
     * @param searcher объект кламма ISearch
     * создает в новом созданном файле запись о файле, в котором осуществлялся поиск,
     * искомое слово и частота его использования в тексте
     */
    public static void createResult(Book book, ISearchEngine searcher){

        File newFile = new File(Book.getBookPath() + "/result.txt");
        try {
            if(newFile.createNewFile()){
                System.out.println("Файл result.txt создан");
            }
        }catch (IOException e){
            System.out.println("Файл не создан");
        }

        try(FileWriter writer = new FileWriter(newFile, true))
        {
            // запись результата
            String text = Book.getBookName() + " - " + searcher + "\n";;
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
