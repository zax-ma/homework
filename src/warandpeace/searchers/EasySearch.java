package warandpeace.searchers;

import warandpeace.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    private static final String splitter = "-*[](),;:.?! ";

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
            for (int i = 0; i < text.length(); i++) {
                int wordFirstIndex = word.indexOf(text.charAt(i));
                int wordLength = word.length();

                if ((wordFirstIndex > -1 && wordFirstIndex != 0)
                        && (splitter.indexOf(text.charAt(i - 1)) > -1)
                        && (splitter.indexOf(text.charAt(i + wordLength)) > -1)
                        && (i + wordLength < text.length() - 1)) {
                    for (int j = 0; j < wordLength; j++) {
                        if (wordFirstIndex > -1) {
                            count++;
                        }
                    }
                } else if (wordFirstIndex == 0
                        && i + wordLength < text.length()
                        && (splitter.indexOf(text.charAt(i + wordLength)) > -1)) {
                    for (int j = 0; j < wordLength; j++) {
                        if (wordFirstIndex > -1) {
                            count++;
                        }
                    }
                } else if (wordFirstIndex > -1 && i + wordLength == text.length() - 2) {
                    for (int j = 0; j < wordLength; j++) {
                        if (wordFirstIndex > -1) {
                            count++;
                        }
                    }
                }
            }

            return wordCounter = count / word.length();
        }

    @Override
    public String toString () {
        return name +
                " - " + wordCounter + " раз";

    }
}

