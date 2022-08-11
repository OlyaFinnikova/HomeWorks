package part11.urt;

import part11.urt.task.Case;
import part11.urt.task.Importance;

/**
 * Создание дел
 */
public class CaseCreator {
    /**
     * Создаёт новое дело
     *
     * @param name название дела
     * @return новое дело
     */
    public Case create(String name) {
        UserValue userValue = new UserValue();
        String description = userValue.getUserDescription();
        String importance = userValue.getImportanceCase();
        return new Case(name, description, convertImportance(importance));
    }

    /**
     * Создаёт сохранённоё дело
     *
     * @param values значения, полученные при парсинге
     * @return новое дело
     */
    public Case create(String[] values) {
        Case newCase = new Case(values[0], values[1], convertImportance(values[2]));
        newCase.setStatusCompletion(convertStatus(values[3]));
        return newCase;
    }

    /**
     * Переводит значения в нужный тип
     *
     * @param value значение пользователя
     * @return важность дела
     */
    private Importance convertImportance(String value) {
        if (value.equals("критично")) {
            return Importance.CRITICAL;
        } else if (value.equals("средне")) {
            return Importance.MEDIUM;
        } else {
            return Importance.UNIMPORTANT;
        }
    }

    /**
     * Переводит значения в boolean
     *
     * @param value значение пользователя
     * @return статус выполнения
     */
    private boolean convertStatus(String value) {
        return value.equals("выполнено");
    }
}
