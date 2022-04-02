package part10.unit1;

public class Execute {

    public void execute() {

        ChoiceCommands commands = new ChoiceCommands();
        UserValue userValue = new UserValue();
        String text = userValue.getUserCommands();

        while (!text.contains("exit")) {
            commands.startDesiredCommand(text);
            text = userValue.getUserCommands();
        }
    }
}
