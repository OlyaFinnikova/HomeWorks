package part11.urt.actions;

import part11.urt.AddingCases;
import part11.urt.task.Case;

import java.util.Map;

public class ActionCreate extends Action {

    private AddingCases addingCases;

    public ActionCreate(String name, AddingCases addingCases) {
        super(name);
        this.addingCases = addingCases;
    }


    @Override
    public void execute(Map<String, Case> cases) {
        if (!super.checkExecution(cases, getName())) {
            addingCases.addUserCase(cases, getName());
        } else {
            System.out.println("Задача с таким именем уже есть, команда не выполнена!");
        }
    }

    @Override
    public boolean checkExecution(Map<String, Case> cases, String name) {
        for (Map.Entry<String, Case> entry : cases.entrySet()) {
            if (!entry.getKey().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
