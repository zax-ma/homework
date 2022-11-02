package warandpeace;

import warandpeace.api.IReadFile;
import warandpeace.api.ISearchEngine;
import warandpeace.dto.Book;
import warandpeace.filereaders.ReadFileFromConsole;
import warandpeace.filereaders.ReadFileToString;
import warandpeace.filereaders.WriteResultToFile;
import warandpeace.searchers.EasySearch;

import java.util.Scanner;

public class WarAndPeaceMain {

    public static void main(String[] args) throws Exception {


        IReadFile fileToRead = new ReadFileToString();
        ISearchEngine easySearch = new EasySearch();

        Scanner scanner = new Scanner(System.in);

        Book book = null;

        ReadFileFromConsole reader = new ReadFileFromConsole();
        String path;
        do {

            System.out.println("Введите адрес папки с книгами: ");
            path = scanner.nextLine();
            reader.readFile(path);
            String name;
            do {
                name = null;

                    System.out.println("Введите имя файла для поиска: ");
                    name = scanner.nextLine();
                    reader.readName(path, name);
                    book = new Book(path, name);

//do

                String wordToSearch;
                do {

                    System.out.println("Введите слово для поиска: ");
                    wordToSearch = scanner.nextLine();

                    ReadFileToString file = new ReadFileToString();
                    String content = file.readFile(Book.getBookPathName());

                    ISearchEngine searchWord = new EasySearch();
                    searchWord.search(content, wordToSearch);

                    WriteResultToFile.createResult(book, searchWord);
                } while (!wordToSearch.equals("back"));
            } while (!name.equals("exit"));

        } while (!path.equals("exit"));
    }

    }

