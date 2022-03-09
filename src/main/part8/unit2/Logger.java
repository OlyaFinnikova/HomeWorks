package part8.unit2;

import java.util.Date;

public class Logger {

    public void log (LevelTrace[] trace,int log){
        System.out.println("Введите куда записывать информацию.");
        int valueUser = new UserValue().getUserPlace();
        if (valueUser == 1) {
            System.out.println(getLog(trace,log));
        } else {
        new WritingInFile().writeFile(getLog(trace,log),new WritingInFile().textFile);
        }
    }


    private String getLog (LevelTrace[] expectedInformation, int actualInformation) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < actualInformation; i++) {
            if (expectedInformation[i].getLevel()>=actualInformation){
                builder.append(expectedInformation[i].getName()).append(new Date().getTime()).append("\n");
            }
        }
        return builder.toString();
    }
}
