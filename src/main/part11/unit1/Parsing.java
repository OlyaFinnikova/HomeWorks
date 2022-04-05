package part11.unit1;

import java.util.ArrayList;
import java.util.List;

public class Parsing {

    private List<Case> listCase = new ArrayList<>();

    public List<Case> executeParsing(String text) {
        if (text.isEmpty()){
            return listCase;
        }
        String[] cases = text.split(" \n");
        for (String aCase : cases) {
            Case caseUser = new Case(getName(aCase), getDescription(aCase), getImportance(aCase), getStatusCompleted(aCase));
            listCase.add(caseUser);
        }
        return listCase;
    }

    private String getName (String text) {
        String[] valuesForCase = text.split(", ");
        String partText = valuesForCase[0];
        return partText.substring(partText.indexOf('=')+1);
    }

    private String getDescription (String text) {
        String[] valuesForCase = text.split(", ");
        String partText = valuesForCase[1];
        return partText.substring(partText.indexOf('=')+1);
    }

    private Importance getImportance(String text) {

        String[] valuesForCase = text.split(", ");
        String partText = valuesForCase[2];
        String value = partText.substring(partText.indexOf('=')+1);

        if (value.equals("критично")) {
            return Importance.CRITICAL;
        } else if (value.equals("средне")) {
            return Importance.MEDIUM;
        } else {
            return Importance.UNIMPORTANT;
        }
    }

    private boolean getStatusCompleted(String text) {

        String[] valuesForCase = text.split(", ");
        String partText = valuesForCase[3];
        String value = partText.substring(partText.indexOf('=')+1);
        if (value.equals("true")){
            return true;
        }else{
            return false;
        }
    }
}
