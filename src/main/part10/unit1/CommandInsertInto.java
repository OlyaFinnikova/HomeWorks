package part10.unit1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandInsertInto implements IExecutionCommand {
    @Override
    public void executeCommand(String text) {

        List<DataType> columnValue = new ArrayList<>();
        for (Table table : listTable) {
            if (parsing.getNameTable(text).equals(table.getNameTable())) {
                String[] str = parsing.getColumnValue(text);
                for (int i = 0; i < str.length; i++) {
                    if (table.getColumnType().get(i).equals("numeric")) {
                        columnValue.add(new DataType(new BigDecimal(str[i])));
                    }
                    if (table.getColumnType().get(i).equals("varchar")) {
                        columnValue.add(new DataType(str[i]));
                    }
                    if (table.getColumnType().get(i).equals("bool")) {
                        columnValue.add(new DataType(Boolean.valueOf(str[i])));
                    }
                }
                table.setLinesWithValues(columnValue);
            }
        }
    }

    private Map<Integer, List<DataType>> updateTable(Map<Integer, List<DataType>> table, List<DataType> tableLinesList) {
        int counter = 0;
        Map<Integer, List<DataType>> templateTable = new HashMap<>();
        if (!table.isEmpty()) {
            for (Map.Entry<Integer, List<DataType>> entry : table.entrySet()) {
                templateTable.put(counter, entry.getValue());
                counter++;
            }
        }
        templateTable.put(counter, tableLinesList);
        return templateTable;
    }
}
