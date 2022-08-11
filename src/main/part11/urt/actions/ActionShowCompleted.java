package part11.urt.actions;

import part11.urt.task.Case;

import java.util.Map;

public class ActionShowCompleted extends Action {

    public ActionShowCompleted() {
    }

    @Override
    public void execute(Map<String, Case> cases) {
        if (checkExecution(cases)) {
            for (Map.Entry<String, Case> entry : cases.entrySet()) {
                if (entry.getValue().isStatusCompletion()) {
                    System.out.println(entry.getValue().toString());
                }
            }
        } else {
            System.out.println("Выполненых задач нет");
        }
    }

    @Override
    public boolean checkExecution(Map<String, Case> cases) {
        for (Map.Entry<String, Case> entry : cases.entrySet()) {
            if (entry.getValue().isStatusCompletion()) {
                return true;
            }
        }
        return false;
    }
}
