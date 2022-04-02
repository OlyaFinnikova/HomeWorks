package part10.unit1;

public class DefiningCommandUser {

    public boolean getDesiredAction (String text, String desiredValue){
        if (text.contains("create table")) {
            return true;
        }
        return false;
    }


}
