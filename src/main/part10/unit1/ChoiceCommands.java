package part10.unit1;

public class ChoiceCommands {

    public void startDesiredCommand(String text) {

        if (text.contains("create table")) {
            new CommandCreateTable().executeCommand(text);
        } else if (text.contains("insert into")) {
            new CommandInsertInto().executeCommand(text);
        } else if (text.contains("select")) {
            if ((text.contains("where"))) {
                new CommandSelectFromWhere().executeCommand(text);
            } else {
                new CommandSelectFrom().executeCommand(text);
            }
        } else if (text.contains("delete")) {
            if ((text.contains("where"))) {
                new CommandDeleteFromWhere().executeCommand(text);
            } else {
                new CommandDeleteFrom().executeCommand(text);
            }
        }
    }
}
