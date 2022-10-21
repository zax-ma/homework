package warandpeace;

import warandpeace.api.IReadFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileToString implements IReadFile {
    private String contents;

    @Override
    public String readFile(String file) {

        Path path = Paths.get(file);
        try {
            contents = Files.readString(path, StandardCharsets.UTF_8);
        }catch(FileNotFoundException f){
            System.out.println("Ошибка. Файл не найден."); //throw new
        } catch(IOException e){
            System.out.println("Ошибка чтения файла."); //использовать string builder
        }
        return contents;
    }
}
