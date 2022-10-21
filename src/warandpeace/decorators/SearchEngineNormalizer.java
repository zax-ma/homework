package warandpeace.decorators;

import warandpeace.api.ISearchEngine;

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

