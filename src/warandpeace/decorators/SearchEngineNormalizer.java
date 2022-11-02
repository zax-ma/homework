package warandpeace.decorators;

import warandpeace.api.ISearchEngine;

/**
 * Класс для приведения всех слов в тексте к нижнему регистру
 */

public class SearchEngineNormalizer implements ISearchEngine {

    ISearchEngine normalizer;

    public SearchEngineNormalizer(ISearchEngine normalizer){
        this.normalizer = normalizer;
    }


    @Override
    public long search(String text, String word) {
        return normalizer.search(text.toLowerCase(), word.toLowerCase());
    }

    @Override
    public String toString() {
        return normalizer.toString();
    }


}

