package part10.unit1;

import java.util.ArrayList;
import java.util.List;

public class Parsing {

    public String getNameTable(String text) {
        String partText = text.substring(0, text.indexOf('('));
        String[] results = partText.split(" ");
        return results[2];
    }

    public String getNameTableDelete(String text) {
        String[] results = text.split(" ");
        return results[2];
    }

    public String getNameTableSelect(String text) {
        String[] results = text.split(" ");
        return results[3];
    }

    public List<String> getColumnType(String text) {

        List<String> ListColumnType = new ArrayList<>();
        String partText = text.substring(text.indexOf('(') + 1, text.indexOf(')'));
        ;
        String[] results = partText.split(", ");
        for (int i = 0; i < results.length; i++) {
            String[] value = results[i].split(" ");
            ListColumnType.add(value[1]);
        }
        return ListColumnType;
    }

    public List<String> getColumnName(String text) {

        List<String> ListColumnName = new ArrayList<>();
        String partText = text.substring(text.indexOf('(') + 1, text.indexOf(')'));
        ;
        String[] results = partText.split(", ");

        for (int i = 0; i < results.length; i++) {
            String[] value = results[i].split(" ");
            ListColumnName.add(value[0]);
        }
        return ListColumnName;
    }

    public String[] getColumnValue(String text) {

        String partText = text.substring(text.indexOf('(') + 1, text.indexOf(')'));
        String[] results = partText.split(", ");
        for (int i = 0; i < results.length; i++) {
            if (results[i].contains("‘")) {
                results[i] = text.substring(text.indexOf('‘') + 1, text.indexOf('’'));
            }
        }
        return results;
    }

    public String getDesiredColumnValueToSelectDeleteWhere(String text) {
        String partText = text.split("=")[1];
        return partText;
    }

    public String getDesiredColumnNameToDeleteWhere(String text) {

        String[] words = text.split(" ");
        String partText = words[4];
        return partText.substring(0, partText.indexOf('='));
    }

    public String getDesiredColumnNameToSelectWhere(String text) {
        String[] words = text.split(" ");
        String partText = words[5];
        return partText.substring(0, partText.indexOf('='));
    }
}
