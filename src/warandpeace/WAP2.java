package warandpeace;

import warandpeace.api.ISearchEngine;
import warandpeace.filereaders.ReadFileToString;
import warandpeace.searchers.EasySearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WAP2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String fileName = null;

            System.out.println("Введите адрес папки с книгами: ");
            String adress = scanner.nextLine();

            File dir = new File(adress);
            String[] files = dir.list();

            File data = null;
            do {
                System.out.println("В указанной папке находятся следующие файлы:");
                for (String file : files) {
                    if (file.contains(".txt")) {
                        System.out.println(file);
                    }
                }
                System.out.println("Введите имя файла для работы с ним, в формате имя.формат_файла(name.txt):");

                boolean flag = true;
                while (flag) {
                    fileName = scanner.nextLine();
                    for (String file : files) {
                        if (file.equals(fileName) || fileName.equals("exit")) {


                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Введено неверное имя файла, повторите ввод");
                    }
                }
                if (!fileName.equals("exit")) {
                    data = new File(adress + fileName);
                }
                File newFile = new File(adress + "result.txt");

                ReadFileToString convertion = new ReadFileToString();
                String stringFile = convertion.readFile(String.valueOf(data));
                String wordScan;
                if (!fileName.equals("exit")) {
                    do {


                        System.out.println("Введите слово, которое хотите найти:");
                        wordScan = scanner.nextLine();
                        if (wordScan == null) {
                            System.out.println("ээээ?");
                            break;
                        }
                        ISearchEngine search = new EasySearch();
                        search.search(stringFile, wordScan);
                        try (FileWriter writer = new FileWriter(newFile, true)) {
                            // запись результата
                            if (!wordScan.equals("back")) {
                                String text = fileName + " - " + search + "\n";

                                writer.write(text);

                                writer.flush();
                            }
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                        System.out.print("Напишите \"back\" для возврата к выбору файла или ");

                    } while (!wordScan.equals("back"));
                }

            }
            while (!(fileName.equals("exit"))) ;

        }

    }




