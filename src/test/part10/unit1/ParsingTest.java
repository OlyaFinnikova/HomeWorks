package part10.unit1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ParsingTest {
    Parsing parsing = new Parsing();

    @Test
    public void getNameTableTest() {
        String text = "create table my_table(id numeric, value varchar, check bool)";
        String expected = "my_table";
        String actual = parsing.getNameTable(text);
        assertEquals(expected, actual);
    }

    @Test
    public void getColumnTypeTest() {
        String text = "create table my_table(id numeric, value varchar)";
        List<String> expected = new ArrayList<>();
        expected.add("numeric");
        expected.add("varchar");
        List<String> actual = parsing.getColumnType(text);
        assertEquals(expected, actual);
    }

    @Test
    public void getColumnNameTest() {
        String text = "create table my_table(id numeric, value varchar)";
        List<String> expected = new ArrayList<>();
        expected.add("id");
        expected.add("value");
        List<String> actual = parsing.getColumnName(text);
        assertEquals(expected, actual);
    }

    @Test
    public void getColumnValueTest() {
        String text = "insert into my_table(1, ‘значение’, true)";
        String[] expected = {"1", "значение", "true"};
        String[] actual = parsing.getColumnValue(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getDesiredIdTest() {
        String text = "delete from my_table where id=2";
        String actual= parsing.getDesiredColumnValueToSelectDeleteWhere(text);
        String expected = "2";
        assertEquals(expected,actual);
    }
    @Test
    public void getDesiredColumnNameToSelectWhereTest() {
        String text = "select * from my_table where id=2";
        String actual= parsing.getDesiredColumnNameToSelectWhere(text);
        String expected = "id";
        assertEquals(expected,actual);
    }
}