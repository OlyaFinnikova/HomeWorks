package part11.urt;

/**
 * Парсинг
 */
public class Parsing {
    /**
     * Парсит строку
     *
     * @param text строка
     * @return значения для создания дела
     */
    public String[] parseCase(String text) {

        String[] valuesForCase = text.split(", ");
        String[] parsingValue = new String[valuesForCase.length];
        for (int i = 0; i < valuesForCase.length; i++) {
            String partText = valuesForCase[i];
            parsingValue[i] = valuesForCase[i].substring(partText.indexOf('=') + 1);
        }
        return parsingValue;
    }
}
