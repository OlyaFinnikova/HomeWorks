package part10.unit1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandDeleteFromWhere implements IExecutionCommand {
    @Override
    public void executeCommand(String text) {

        for (Table table : listTable) {
            if (parsing.getNameTableDelete(text).equals(table.getNameTable())) {
                Map<Integer, List<DataType>> map = table.getLinesWithValues();

                    for (int i = 0; i < table.getCounter(); i++) {
                        List<DataType> list = table.getLinesWithValues().get(i);

                        for (int z = 0; z < list.size(); z++) {
                            if (list.get(z).getValue().toString().equals(parsing.getDesiredColumnValueToSelectDeleteWhere(text))) {
                                map.remove(i);
                            }
                        }
                    }
                    map = overWritingMap(map, table);
                    table.setLinesWithValues(map);
            }
        }
    }

    private Map<Integer, List<DataType>> overWritingMap(Map<Integer, List<DataType>> map, Table table) {
        int counter = 0;
        Map<Integer, List<DataType>> temporaryMap = new HashMap<>();
        for (Map.Entry<Integer, List<DataType>> entry : map.entrySet()) {
            temporaryMap.put(counter, entry.getValue());
            counter++;
        }
        table.setCounter(counter);
        return temporaryMap;
    }
}


