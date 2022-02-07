package part4.unit3;

/**
 * Определяет какой пункт в меню выбрал пользователь
 */
public class Action {

    GameMenu menu = new GameMenu();

    public void selectItem(String userValue) {

        if (userValue.equals(menu.setting)) {
            GameMenu setting = new Setting();
            setting.output();
        }
        if (userValue.equals(menu.newGame)) {
            GameMenu newGame = new NewGame();
            newGame.output();
        }
        if (userValue.equals(menu.continueGame)) {
            GameMenu continueGame = new Continue();
            continueGame.output();
        }
        if (userValue.equals(menu.exit)) {
            GameMenu exit = new Exit();
            exit.output();
        }
    }
}
