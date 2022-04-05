package part11.unit1;


import java.util.ArrayList;
import java.util.List;


public class Execute {

    public static List<Case> listCase = new ArrayList();

    public Parsing parsing = new Parsing();
    public ReadingFromFile readingFromFile = new ReadingFromFile();
    public UserValue userValue = new UserValue();
    public ManagingCasesActions managingCasesActions = new ManagingCasesActions();
    public RecordInFile recordInFile = new RecordInFile();


    public void start() {

        System.out.println("1.Добавить дело");
        System.out.println("2.Удалить дело");
        System.out.println("3.Пометить как выполненое");
        System.out.println("4.Показать список всех дел");
        System.out.println("5.Показать список выполненых дел");
        System.out.println("6.Выход");


        listCase = parsing.executeParsing(readingFromFile.readFile());


        String itemMenu = userValue.getUserItemMenu();
        while (!itemMenu.equals("6")) {
            switch (itemMenu) {
                case ("1"):
                    managingCasesActions.createCases(listCase,userValue.getUserName(),userValue.getUserDescription(),userValue.getImportanceCase());
                    break;
                case ("2"):
                    managingCasesActions.deleteCase(listCase,userValue.getUserName());
                    break;
                case ("3"):
                    managingCasesActions.markAsCompleted(listCase,userValue.getUserName());
                    break;
                case ("4"):
                    managingCasesActions.showAllCases(listCase);
                    break;
                case ("5"):
                    managingCasesActions.showCompletedCases(listCase);
                    break;
                default:
                    System.out.println("Такого пункта нет в меню, повторите ввод");
            }
            itemMenu = userValue.getUserItemMenu();
        }
        recordInFile.writeFile(listCase);
    }
}
