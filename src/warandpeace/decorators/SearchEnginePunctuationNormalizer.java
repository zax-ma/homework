package warandpeace.decorators;

import warandpeace.api.ISearchEngine;

/**
 * Класс для удаления пунктуации и лишних знаков + лишних пробелов в тексте
 */

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private String normalText;
    private ISearchEngine normalizer;

    public SearchEnginePunctuationNormalizer(ISearchEngine normalizer){
        this.normalizer = normalizer;
    }

    /**
     * Метод, заменяющий все не буквенно-числовые символы на ""
     * @param text принимает входным параметром текст
     * @return нормализованный текст
     */
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
