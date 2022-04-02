package part10.unit1;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static part10.unit1.IExecutionCommand.listTable;

public class ChoiceCommandsTest {

    private ChoiceCommands commands = new ChoiceCommands();
    private List<Table> expected = new ArrayList<>();
    private Parsing parsing = new Parsing();
    private Table table;

    @Test
    public void startDesiredCommandReturnCreateTableTest() {

        createTableForTest();

        assertEquals(table.getColumnType(), listTable.get(0).getColumnType());
        assertEquals(table.getColumnName(), listTable.get(0).getColumnName());
        assertEquals(table.getNameTable(), listTable.get(0).getNameTable());
        assertEquals(table.getLinesWithValues(), listTable.get(0).getLinesWithValues());
    }

    @Test
    public void startDesiredCommandReturnInsertInto() {
        String text = "insert into my_table(1, ‘значение’, true)";
        createTableForTest();
        commands.startDesiredCommand(text);

        List<DataType> columnValue = new ArrayList<>();
        Map<Integer, List<DataType>> map = new HashMap<>();

        columnValue.add(new DataType(new BigDecimal("1")));
        columnValue.add(new DataType("значение"));
        columnValue.add(new DataType(Boolean.valueOf("true")));
        map.put(0,columnValue);

        assertEquals(columnValue.get(0).getValue(), listTable.get(0).getLinesWithValues().get(0).get(0).getValue());
        assertEquals(columnValue.get(1).getValue(), listTable.get(0).getLinesWithValues().get(0).get(1).getValue());
        assertEquals(columnValue.get(2).getValue(), listTable.get(0).getLinesWithValues().get(0).get(2).getValue());
    }
    @Test
    public void startDesiredCommandReturnDeleteFrom() {
        String text = "insert into my_table(2, ‘значение1’, true)";
        String text1 = "insert into my_table(2, ‘значение2’, true)";
        String text2 = "insert into my_table(1, ‘значение’, true)";

        String text3 = "delete from my_table where id=1";

        createTableForTest();

        commands.startDesiredCommand(text);
        commands.startDesiredCommand(text1);
        commands.startDesiredCommand(text2);
        commands.startDesiredCommand(text3);

        List<DataType> columnValue = new ArrayList<>();
        Map<Integer, List<DataType>> map = new HashMap<>();
        columnValue.add(new DataType(new BigDecimal("1")));
        columnValue.add(new DataType("значение"));
        columnValue.add(new DataType(Boolean.valueOf("true")));
        map.put(0,columnValue);
        map.put(1,columnValue);


        assertEquals(map.size(), listTable.get(0).getLinesWithValues().size());
    }



    private void createTableForTest() {
        String text = "create table my_table(id numeric, value varchar, check bool)";
        String nameTable = "my_table";
        List<String> columnType = new ArrayList<>();
        columnType.add("numeric");
        columnType.add("varchar");
        columnType.add("bool");
        List<String> columnName = new ArrayList<>();
        columnName.add("id");
        columnName.add("value");
        columnName.add("check");
        Map<Integer, List<DataType>> linesWithValues = new HashMap<>();
        table = new Table(nameTable, columnType, columnName);
        expected.add(table);

        commands.startDesiredCommand(text);
    }

}
