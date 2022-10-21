package warandpeace.searchers;

import warandpeace.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    static long wordCounter = 0;

    String name;

    public static long getWordCounter() {
        return wordCounter;
    }

    public long search(String text, String word) {
        name = word;
        if (word == "") {
            try {
                throw new Exception("Слово не введено");

            } catch (Exception $e) {
                System.out.println("Слово не введено");

            }
            return 0;
        }else if (word.length() <=3 && word.length()>0){
            word = " " + word + " ";
        }


        int position = text.indexOf(word);
        while (position != -1) {
            wordCounter++;
            position = text.indexOf(word, position + 1);

        }

        return wordCounter;
    }

    @Override
    public String toString () {
        return name +
                " - " + wordCounter + " раз";

    }
}

