package part11.urt;

import part11.urt.saving_cases.ReadingFromFile;
import part11.urt.saving_cases.RecordInFile;
import part11.urt.task.Case;

import java.util.HashMap;
import java.util.Map;

public class Execute {

    public void start() {

        Map<String, Case> cases = new HashMap<>();
        AddingCases addingCases = new AddingCases();
        ActionManager actionManager = new ActionManager();
        addingCases.addCasesFromFile(cases, new ReadingFromFile("src/property/part.txt").readFile());
        outputMessage();
        actionManager.choiceAction(cases);
        new RecordInFile("src/property/part.txt").writeFile(cases);
    }

    private void outputMessage() {
        System.out.println("1.Добавить дело \n2.Удалить дело \n3.Пометить как выполненое " +
                "\n4.Показать список всех дел \n5.Показать список выполненых дел \n6.Выход");
    }
}
