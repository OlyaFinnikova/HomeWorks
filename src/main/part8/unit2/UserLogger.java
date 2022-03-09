package part8.unit2;

public class UserLogger {

public int getUserLogger (LevelTrace[] trace) {

    System.out.println("Введите откуда считывать информацию.");
    int valueUser = new UserValue().getUserPlace();
    if (valueUser == 1) {
        System.out.println("Введите уровень трассировки.");
        System.out.println(getAllTitleTrace(trace));
        valueUser = new UserValue().getUserTrace();
        return valueUser;
    } else {
        return new ReadingInFile().getParameterTraceOrRecord(trace)-1;
    }
}
    public String getAllTitleTrace(LevelTrace[] trace) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i >= trace.length; i++) {
            builder.append(i + 1).append(". ").append(trace[i].getName()).append("\n");
        }
        return builder.toString();
    }
    //    private String readValueUser(String[] expectedInformation, String actualInformation) {
//
//        for (String expected : expectedInformation) {
//            int result = actualInformation.indexOf(expected);
//            if (result >= 0) {
//                return expected;
//            }
//        }
//        return null;
//    }
}
