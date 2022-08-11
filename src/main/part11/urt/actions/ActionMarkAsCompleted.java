package part11.urt.actions;

import part11.urt.task.Case;

import java.util.Map;

public class ActionMarkAsCompleted extends Action {

    public ActionMarkAsCompleted(String name) {
        super(name);
    }

    @Override
    public void execute(Map<String, Case> cases) {
        if (checkExecution(cases, getName())) {
            cases.get(getName()).setStatusCompletion(true);
        } else {
            System.out.println("Подходящих задач с таким именем нет, команда не выполнена");
        }
    }

    @Override
    public boolean checkExecution(Map<String, Case> cases, String name) {
        for (Map.Entry<String, Case> entry : cases.entrySet()) {
            if (entry.getKey().equals(name) && !entry.getValue().isStatusCompletion()) {
                return true;
            }
        }
        return false;
    }
}









