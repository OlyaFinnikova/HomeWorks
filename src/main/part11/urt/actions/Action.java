package part11.urt.actions;

import part11.urt.task.Case;
import java.util.Map;

public abstract class Action {

    private String name;

    public Action(String name) {
        this.name = name;
    }

    public Action() {
    }

    public abstract void execute(Map<String, Case> cases);

    public boolean checkExecution(Map<String, Case> cases, String name) {
        for (Map.Entry<String, Case> entry : cases.entrySet()) {
            if (entry.getKey().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkExecution(Map<String, Case> cases) {
        if (!cases.isEmpty()) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}

