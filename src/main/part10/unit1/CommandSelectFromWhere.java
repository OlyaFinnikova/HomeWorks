package part10.unit1;

import java.util.List;

public class CommandSelectFromWhere implements IExecutionCommand {
    @Override
    public void executeCommand(String text) {

        for (Table table : listTable) {
            int numberFoundRecords = 0;
            if (parsing.getNameTableSelect(text).equals(table.getNameTable())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Название таблицы: ").append(table.getNameTable()).append("\n").append(table.getColumnName()).append("\n");
                for (int i = 0; i < table.getCounter(); i++) {
                    List<DataType> list = table.getLinesWithValues().get(i);

                    if (list.get(getDesiredNumberColumn(table, text)).getValue().toString().equals(parsing.getDesiredColumnValueToSelectDeleteWhere(text))) {
                        numberFoundRecords++;
                        stringBuilder.append("[");
                        for (DataType valueColumn : list) {
                            if (valueColumn.equals(list.get(list.size()-1))){
                                stringBuilder.append(valueColumn.getValue());
                            }else{
                                stringBuilder.append(valueColumn.getValue()).append(", ");
                            }
                        }
                        stringBuilder.append("]\n");
                    }
                }
                if (numberFoundRecords == 0) {
                    System.out.println("Подходящие записи не найдены");
                } else {
                    System.out.println(stringBuilder);
                }
            }
        }
    }

    private int getDesiredNumberColumn(Table table, String text) {
        int numberColumn = 0;
        for (int i = 0; i < table.getColumnName().size(); i++) {
            if (table.getColumnName().get(i).equals(parsing.getDesiredColumnNameToSelectWhere(text))) {
                numberColumn = i;
            }
        }
        return numberColumn;
    }
}