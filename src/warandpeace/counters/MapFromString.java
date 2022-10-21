package warandpeace.counters;

import warandpeace.Book;

import java.util.HashMap;
import java.util.Map;

public class MapFromString {



    static String linesToSplit = Book.getBookFile();
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

    public static String allWordsCounter() {
        for (String item : words) {
            if (collectionMap.keySet().contains(item) && !(collectionMap.equals(""))) {
                collectionMap.put(item, collectionMap.get(item) + 1);
            } else {
                collectionMap.put(item, 1);
            }
        }
        return collectionMap.toString();
    }



}
