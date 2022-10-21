package warandpeace;

import warandpeace.api.ISearchEngine;
import warandpeace.counters.MapFromString;
import warandpeace.counters.SetFromString;
import warandpeace.decorators.SearchEnginePunctuationNormalizer;
import warandpeace.searchers.EasySearch;

import static warandpeace.sorters.MapSort.sortMapByValue;

public class WarAndPeaceMain {



    public static void main(String[] args) {
        ReadFileToString file = new ReadFileToString();
        Book WarAndPeace = new Book(file.readFile("src/warandpeace/Nekrasov.txt"));
        System.out.println(WarAndPeace);

      /*  SetFromString words = new SetFromString();
        System.out.println("Количество уникальных использованных слов в тексте: " + words.uniqueWordsCounter());
           System.out.println(words.getWords());
        System.out.println(MapFromString.allWordsCounter());

        System.out.println(sortMapByValue());*/

       ISearchEngine easySearch = new EasySearch();
        easySearch.search(Book.getBookFile(), "бабушка");
        System.out.println(easySearch);

       /* ISearchEngine regSearch = new RegExSearch();
        regSearch.search(Book.getBookFile(), "и");
        System.out.println(regSearch);
*/

        ISearchEngine normbook = new SearchEnginePunctuationNormalizer(new EasySearch());
        normbook.search(Book.getBookFile(), "и");
        System.out.println(normbook);

       /*ISearchEngine normbookreg = new SearchEnginePunctuationNormalizer(new RegExSearch());
        normbookreg.search(Book.getBookFile(),"и");
        System.out.println(normbookreg);*/

        /*ISearchEngine nocasenorm = new SearchEngineNormalizer(new EasySearch());
        nocasenorm.search(Book.getBookFile(),"В");
        System.out.println(nocasenorm);
*/
       /* ISearchEngine nocasenormreg = new SearchEngineNormalizer(new RegExSearch());
        nocasenormreg.search(Book.getBookFile(),"В");
        System.out.println(nocasenormreg);*/

       /* ISearchEngine norm = new SearchEngineNormalizer(new EasySearch());
        norm.search(Book.getBookFile(),"И");
        System.out.println(norm);*/


    }
}
