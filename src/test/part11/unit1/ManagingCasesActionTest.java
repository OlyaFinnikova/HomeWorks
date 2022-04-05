package part11.unit1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static part10.unit1.IExecutionCommand.listTable;

public class ManagingCasesActionTest {
    private ManagingCasesActions managingCasesActions = new ManagingCasesActions();

    @Test
    public void createCases() {

        List<Case> listCaseActual = new ArrayList<>();
        List<Case> listCaseExpected = new ArrayList<>();

        Case expectedCase = new Case("Поздравить подругу", "аню с днем рождения", Importance.CRITICAL, false);

        managingCasesActions.createCases(listCaseActual, "Поздравить подругу", "аню с днем рождения", Importance.CRITICAL);
        Case actualCase = listCaseActual.get(0);

        assertEquals(expectedCase.getNameCase(), actualCase.getNameCase());
        assertEquals(expectedCase.getDescriptionCase(), actualCase.getDescriptionCase());
        assertEquals(expectedCase.getImportanceCase(), actualCase.getImportanceCase());
        assertEquals(expectedCase.isStatusCompletionCase(), actualCase.isStatusCompletionCase());
    }

    @Test
    public void deleteCase() {
        List<Case> listCaseActual = new ArrayList<>();
        List<Case> listCaseExpected = new ArrayList<>();

        Case Case1 = new Case("Поздравить подругу", "аню с днем рождения", Importance.CRITICAL, false);
        Case Case2 = new Case("Купить", "молоко", Importance.CRITICAL, false);

        listCaseExpected.add(Case1);

        listCaseActual.add(Case1);
        listCaseActual.add(Case2);
        managingCasesActions.deleteCase(listCaseActual,"Поздравить подругу");

        listCaseActual.removeIf(caseUser -> "Поздравить подругу".equals(caseUser.getNameCase()));
        assertEquals(listCaseExpected.size(), listCaseActual.size());
    }

    @Test
    public void markAsCompleted() {

        List<Case> listCaseActual = new ArrayList<>();

        Case expected = new Case("Поздравить подругу", "аню с днем рождения", Importance.CRITICAL, true);

        Case actual = new Case("Поздравить подругу", "аню с днем рождения", Importance.CRITICAL, false);
        listCaseActual.add(actual);
        managingCasesActions.markAsCompleted(listCaseActual,"Поздравить подругу");
        assertEquals(expected.isStatusCompletionCase(),listCaseActual.get(0).isStatusCompletionCase());
    }


}
