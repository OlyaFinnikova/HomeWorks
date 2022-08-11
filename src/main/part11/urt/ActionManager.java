package part11.urt;

import part11.urt.actions.*;
import part11.urt.task.Case;

import java.util.Map;

/**
 * Выбор нужного метода
 */
public class ActionManager {

    /**
     * Выбирает нужный пользователю запрос
     *
     * @param cases список дел
     */
    public void choiceAction(Map<String, Case> cases) {
        UserValue userValue = new UserValue();
        String itemMenu = userValue.getUserItemMenu();

        while (!itemMenu.equals("6")) {
            switch (itemMenu) {
                case ("1"):
                    new ActionCreate(userValue.getUserName(), new AddingCases(new CaseCreator())).execute(cases);
                    break;
                case ("2"):
                    new ActionDelete(userValue.getUserName()).execute(cases);
                    break;
                case ("3"):
                    new ActionMarkAsCompleted(userValue.getUserName()).execute(cases);
                    break;
                case ("4"):
                    new ActionShowAll().execute(cases);
                    break;
                case ("5"):
                    new ActionShowCompleted().execute(cases);
                    break;
                default:
                    System.out.println("Такого пункта нет в меню, повторите ввод");
            }
            itemMenu = userValue.getUserItemMenu();
        }
    }
}
