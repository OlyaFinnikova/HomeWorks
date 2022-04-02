package part10.unit1;

import java.util.List;
import java.util.Map;

public class CommandDeleteFrom implements IExecutionCommand {
    @Override
    public void executeCommand(String text) {

        for (Table table : listTable) {
            if (parsing.getNameTableDelete(text).equals(table.getNameTable())) {
                Map<Integer, List<DataType>> map = table.getLinesWithValues();
                for (int i = 0; i < map.size(); i++) {
                    map.remove(i);
                }
                table.setCounter(0);
            }
        }
    }
}