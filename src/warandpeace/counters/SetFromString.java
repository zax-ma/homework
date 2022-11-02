package warandpeace.counters;

import warandpeace.dto.Book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetFromString {

    private static int count;

    private String linesToSplit = Book.getBookPathName();

    private Set<String> words = new HashSet<>(Arrays.asList(linesToSplit
            .replaceAll("\\s*(\\s|,|!|:|;|-|—|--|»|«|\\?|\\(|\\)|\\]|\\[|\\.)\\s*", " ")
            .split(" ")));

    public Set<String> getWords() {
        return words;
    }

    /**
     * Метод дял подсчета уникальных слов, использованных в тексте
     * @return количество
     */
    public int uniqueWordsCounter(){

        for (String item: words) {
            count++;
        }
        return count;

    }

}
