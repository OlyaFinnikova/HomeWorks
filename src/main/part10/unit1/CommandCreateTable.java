package part10.unit1;

public class CommandCreateTable implements IExecutionCommand {
    @Override
    public void executeCommand(String text) {
        Table table = new Table(parsing.getNameTable(text), parsing.getColumnType(text), parsing.getColumnName(text));
        listTable.add(table);
    }
}
