package part10.unit1;

import java.util.List;

public class CommandSelectFrom implements IExecutionCommand {

    @Override
    public void executeCommand(String text) {

        for (Table table : listTable) {
            if (parsing.getNameTableSelect(text).equals(table.getNameTable())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Название таблицы: ").append(table.getNameTable()).append("\n").append(table.getColumnName()).append("\n");
                for (int i = 0; i < table.getCounter(); i++) {
                    stringBuilder.append("[");
                    List<DataType> list = table.getLinesWithValues().get(i);
                    for (int z = 0; z < list.size(); z++) {
                        if (!(z == list.size() - 1)) {
                            stringBuilder.append(list.get(z).getValue()).append(", ");
                        } else {
                            stringBuilder.append(list.get(z).getValue());
                        }

                    }
                    stringBuilder.append("]\n");
                }
                System.out.print(stringBuilder);
            }
        }
    }
}


