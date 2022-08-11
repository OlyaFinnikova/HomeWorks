package part11.urt.actions;

import part11.urt.task.Case;

import java.util.Map;

public class ActionDelete extends Action {

    public ActionDelete(String name) {
        super(name);
    }

    @Override
    public void execute(Map<String, Case> cases) {
        if (super.checkExecution(cases, getName())) {
            cases.remove(getName());
        } else {
            System.out.println("Задач с таким именем нет, команда не выполнена");
        }
    }
}
