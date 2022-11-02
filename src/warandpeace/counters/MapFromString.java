package warandpeace.counters;

import warandpeace.comparators.MapValueComparator;
import warandpeace.dto.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapFromString {



    static String linesToSplit = Book.getBookPathName();
    private static String[] words = linesToSplit
            .replaceAll("\\s*(\\s|,|!|:|;|-|—|»|«|\\?|\\(|\\)|\\]|\\[|\\.)\\s*", " ")
            .split(" ");
    //replaceAll("/[^\\w\\s]/gi, ''", "\\s").split("\\s*")
    private static Map<String, Integer> collectionMap = new HashMap<>();

    public static Map<String, Integer> getCollectionMap() {
        return collectionMap;
    }

    public static void setCollectionMap(Map<String, Integer> collectionMap) {
        MapFromString.collectionMap = collectionMap;
    }

    /**
     * Метод для подсчета каждого использованного слова в тексте
     * @return возвращает топ n слов по количеству использования в тексте Мар с ключ-значение
     */

    public static List allWordsCounter(int top) {
        for (String item : words) {
            if (collectionMap.keySet().contains(item)) {
                collectionMap.put(item, collectionMap.get(item) + 1);
            } else {
                collectionMap.put(item, 1);
            }
        }
        List topWords = new ArrayList(collectionMap.entrySet());
        topWords.sort(new MapValueComparator());
        List wordstopn = topWords.subList(0,top);
        return wordstopn;
    }

}
