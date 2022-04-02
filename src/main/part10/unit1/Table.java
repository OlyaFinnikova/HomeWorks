package part10.unit1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {

    private String nameTable;
    private List<String> columnType;
    private List<String> columnName;
    private Map<Integer, List<DataType>> linesWithValues = new HashMap<>();
    private int counter = 0;


    public Table(String nameTable, List<String> columnType, List<String> columnName) {
        this.nameTable = nameTable;
        this.columnType = columnType;
        this.columnName = columnName;
    }

    public String getNameTable() {
        return nameTable;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }

    public List<String> getColumnType() {
        return columnType;
    }

    public void setColumnType(List<String> columnType) {
        this.columnType = columnType;
    }

    public List<String> getColumnName() {
        return columnName;
    }

    public void setColumnName(List<String> columnName) {
        this.columnName = columnName;
    }

    public Map<Integer, List<DataType>> getLinesWithValues() {
        return linesWithValues;
    }

    public void setLinesWithValues(Map<Integer, List<DataType>> linesWithValues) {
        this.linesWithValues = linesWithValues;
    }

    public void setLinesWithValues(List<DataType> line) {
        this.linesWithValues.put(this.counter++, line);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Table{" +
                "nameTable='" + nameTable + '\'' +
                ", columnName=" + columnName +
                '}';
    }
}
