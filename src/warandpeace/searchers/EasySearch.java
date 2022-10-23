package warandpeace.searchers;

import warandpeace.api.ISearchEngine;

import java.util.PrimitiveIterator;

public class EasySearch implements ISearchEngine {
    private static final String splitter = ",;:.?! \"\n";


    static long wordCounter = 0;

    String name;

    public static long getWordCounter() {
        return wordCounter;
    }

    /**
     * Простой поиск слова в строке без учета пунктуации
     * @param text - текст, в котором нужно найти слово
     * @param word - слово
     * @return сколько раз в тексте встречается искомое слово
     */
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
        int count = 0;
        String lowerCaseTextString = text.toLowerCase();
        String lowerCaseWord = word.toLowerCase();
        int wordLength = word.length();

        for (int i = 0; i < text.length(); i++) {
            int wordFirstIndex = word.indexOf(text.charAt(i));

            //если текст состоит из одного искомого слова
            if (wordLength == text.length()) {
                for (int j = 0; j < wordLength; j++) {
                    if (word.charAt(j) == text.charAt(i)) {
                        count++;
                        i++;
                    }
                }
            }

            //если слово стоит в начале строки
            else if(i == 0 && wordFirstIndex == 0
                    && (splitter.indexOf(text.charAt(i + wordLength)) > -1)){
                for (int j = 0; j < wordLength; j++) {
                    if (word.charAt(j) == text.charAt(i)) {
                        count++;
                        i++;
                    }
                }
            }

            //если слово стоит в середине строки
            else if ( i > 0 && wordFirstIndex == 0
                    && i + wordLength < text.length()
                    && (splitter.indexOf(text.charAt(i - 1)) > -1)
                    && (splitter.indexOf(text.charAt(i + wordLength)) > -1)) {
                for (int j = 0; j < wordLength; j++) {
                    if (word.charAt(j) == text.charAt(i)) {
                        count++;
                        i++;
                    }
                }
            }

            //если слово стоит в конце строки
            else if (i > 0 && i + wordLength == text.length()
                    && ((splitter.indexOf(text.charAt(i - 1)) > -1)
                    || (splitter.indexOf(text.charAt(i - 1)) > -1))) {
                for (int j = 0; j < wordLength; j++) {
                    if (word.charAt(j) == text.charAt(i)) {
                        count++;
                        i++;
                    }
                }
            }

            if (count % wordLength != 0) {
                while (count % wordLength != 0) {
                    count--;
                }

            }


        }
        return wordCounter = count / wordLength;
    }

    @Override
    public String toString () {
        return name +
                " - " + wordCounter + " раз";

    }
}

