package part11.urt.actions;

import part11.urt.task.Case;

import java.util.Map;

public class ActionShowAll extends Action {

    public ActionShowAll() {
    }

    @Override
    public void execute(Map<String, Case> cases) {
        if (super.checkExecution(cases)) {
            for (Map.Entry<String, Case> entry : cases.entrySet()) {
                System.out.println(entry.getValue().toString());
            }
        } else {
            System.out.println("Список задач пуст");
        }
    }
}
