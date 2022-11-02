package warandpeace.searchers;

import warandpeace.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {


    private static long wordCounter = 0;

    public static String name;

    /**
     * Метод поиска с помощью регулярных выражени
     * @param text текств, в котором ищем
     * @param word слово, которое ищем
     * @return количество раз, которое встречается искомое слово
     */
    @Override
    public long search(String text, String word) {
        name = word;

        if (word == "") {
            try {
                throw new Exception("Слово не введено");

            } catch (Exception $e) {
                System.out.println("Слово не введено");

            }
            return 0;
        }

        Pattern regexp = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);

        Matcher match = regexp.matcher(text);
        while (match.find()){
            wordCounter++;
        }
        return wordCounter;
    }

    /**
     * Билдер, преобразование данныех в строковое представление
     * @return слово - количество раз, которое встречается в тексте
     */
    @Override
    public String toString() {
        return
                name +
                        " - " + wordCounter +" раз";
    }


}