package part11.urt;

import part11.urt.task.Case;

import java.util.Map;

/**
 * Добавление дел
 */
public class AddingCases {

    private Parsing parsing;
    private CaseCreator caseCreator;

    public AddingCases(CaseCreator caseCreator) {
        this.caseCreator = caseCreator;
    }

    public AddingCases() {
        this.parsing = new Parsing();
        this.caseCreator = new CaseCreator();
    }

    /**
     * Добавляет дела, сохранённые в документе
     *
     * @param listCases список дел
     * @param text      данные документа
     */
    public void addCasesFromFile(Map<String, Case> listCases, String text) {
        Case newCase;
        if (!text.isEmpty()) {
            String[] cases = text.split(" \n");
            for (String newCaseValue : cases) {
                newCase = caseCreator.create(parsing.parseCase(newCaseValue));
                listCases.put(newCase.getName(), newCase);
            }
        }
    }

    /**
     * Добавляет новые дела
     *
     * @param listCases список дел
     * @param name      название дела
     */
    public void addUserCase(Map<String, Case> listCases, String name) {
        Case newCase = caseCreator.create(name);
        listCases.put(newCase.getName(), newCase);
    }
}
