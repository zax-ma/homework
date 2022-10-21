package warandpeace.sorters;

import warandpeace.comparators.MapValueComparator;
import warandpeace.counters.MapFromString;

import java.util.*;

public class MapSort {


    static Map<String, Integer> mapToSort = MapFromString.getCollectionMap();

    public static Map<String, Integer> getMapToSort() {
        return mapToSort;
    }

    public static String sortMapByValue() {

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mapToSort.entrySet());

        Collections.sort(entryList, new MapValueComparator().reversed());


        Iterator<Map.Entry<String, Integer>> iter = entryList.iterator();
        Map.Entry<String, Integer> tmpEntry;

        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }


        return String.valueOf(sortedMap.entrySet().toString());




   /* public static Map<String, Integer> sortMapByValue() {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mapToSort.entrySet());
        Collections.sort(entryList, new MapValueComparator().reversed());
        Iterator<Map.Entry<String, Integer>> iter = entryList.iterator();
        Map.Entry<String, Integer> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;*/

    }
}
