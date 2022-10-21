package warandpeace.decorators;

import warandpeace.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private String normalText;
    private ISearchEngine normalizer;

    public SearchEnginePunctuationNormalizer(ISearchEngine normalizer){
        this.normalizer = normalizer;
    }

    public String normal(String text) {
        normalText = text.replaceAll("^\\w|^\\d|\\n", "");
        return normalText;
    }

    @Override
    public long search(String text, String word) {
        return normalizer.search(normal(text), word);
    }

    @Override
    public String toString() {
        return normalizer.toString();
    }
}
