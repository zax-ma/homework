package warandpeace.filereaders;

import warandpeace.api.IReadFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileToString implements IReadFile {
    private String contents;

    /**
     * Чтение файла и преобразование в строку
     * @param file путь и имя файла
     * @return текст из файла, преобразованный в строку
     */
    @Override
    public String readFile(String file) {

        Path path = Paths.get(file);

        try {
         contents = Files.readString(path, StandardCharsets.UTF_8);

        }catch(FileNotFoundException f){
            System.out.println("Ошибка. Файл не найден.");
        } catch(IOException e){
            System.out.println("Ошибка чтения файла.");
        }
        return contents;
    }
}
