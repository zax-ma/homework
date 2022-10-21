package warandpeace.searchers;

import warandpeace.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {


    private static long wordCounter = 0;

    public static String name;

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



    @Override
    public String toString() {
        return
                name +
                        " - " + wordCounter +" раз";
    }


}