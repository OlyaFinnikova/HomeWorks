package part11.unit1;

import java.util.List;

public class ManagingCasesActions {

    public void createCases(List<Case> listCase, String nameCase, String descriptionCase, Importance importance) {
        Case caseUser = new Case(nameCase, descriptionCase, importance, false);
        listCase.add(caseUser);
    }

    public void deleteCase(List<Case> listCase, String nameCase) {
        listCase.removeIf(caseUser -> nameCase.equals(caseUser.getNameCase()));
    }

    public void markAsCompleted(List<Case> listCase, String nameCase) {
        for (Case caseUser : listCase) {
            if (caseUser.getNameCase().equals(nameCase)) {
                caseUser.setStatusCompletionCase(true);
            }
        }
    }

    public void showAllCases(List<Case> listCase) {
        for (Case caseUser : listCase) {
            System.out.println(caseUser.toString());
        }
    }

    public void showCompletedCases(List<Case> listCase) {
        for (Case caseUser : listCase) {
            if(caseUser.isStatusCompletionCase()) {
                System.out.println(caseUser.toString());
            }
        }
    }
}
