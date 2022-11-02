package warandpeace_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import warandpeace.api.ISearchEngine;
import warandpeace.searchers.EasySearch;

public class WarAndPeace_EasySearch_Test {

    @Test
     void searchTestSentence1() {
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1, search.search("привет, как дела!", "дела"));
    }

    @Test
    void searchTestSentence2() {
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1, search.search("привет,какдела!", "привет"));
    }

    @Test
    void searchTestSentence3() {
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1, search.search("привет;какдела!", "привет"));
      }

    @Test
    void searchTestSentence4() { //переделать
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1, search.search("как дела!.Что делаешь?", "делаешь"));
    }

    @Test
    void searchTestSentence5() { //переделать
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1,search.search("Привет-привет", "Привет-привет"));
    }

    @Test
    void searchTestSentence6() { //переделать
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1, search.search("Привет -привет", "Привет"));
    }

    @Test
    void searchTestSentence7() {
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1, search.search("4-х", "4-х"));
    }

    @Test
    void searchTestSentence8() { //переделать
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1, search.search("один и 1", "1"));
    }

    @Test
    void searchTestSentence9() {
        ISearchEngine search = new EasySearch();
        Assertions.assertEquals(1, search.search("бабушка бабушке бабушку", "бабушку"));
    }
}
