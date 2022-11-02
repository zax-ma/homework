package warandpeace.filereaders;

import warandpeace.dto.Book;

import java.io.File;

public class ReadFileFromConsole {

    /**
     * Метод отображения всех тестовых файлов (расширение .txt), содержащихся в указанной директории
     * @param path принимает адрес директории в качестве входного параметра
     * @throws Exception по окончании работы с пользователем (получено слово "exit")
     */
    public static void readFile(String path) throws Exception {
        if (path.equals("exit")) {
            System.out.println("Good Bye!");
            System.exit(0);
        }
        if(!path.equals("exit")) {
            File dir = new File(path);
            String[] files = dir.list();

        for (String file : files) {
            if (file.contains(".txt")) {
                System.out.println(file);
            }
            }
        }
    }

    /**
     * Метод, выполняющий поиск заданного файла в директории для работы с ним
     * @param path входной параметр адрес папки
     * @param fileName входной параметр наименование файла
     */
        public static void readName(String path, String fileName){

            File dir = new File(path);
            String[] files = dir.list();

            boolean flag = true;
            do {

                if (!(fileName.contains(".txt"))) {
                    fileName = fileName + ".txt";
                }
                for (String file : files) {
                        if (file.equals(fileName)){
                        flag = false;}

                }
            } while (flag);
    }
}
