package part8.unit2;

import java.util.Map;

public class Logger {

    private static Map<String, String> map = new ReadingFromFile().read();
    private static LevelTrace levelTrace = new GettingLoggingParameter().getKey(map);
    private static Writing writer = new GettingRecordingParameter().getKey(map);

    public static void init(LevelTrace levelTrace, Writing writer) {
        Logger.levelTrace = levelTrace;
        Logger.writer = writer;
    }

    public void log(LevelTrace trace, String message) {
        if (Logger.levelTrace.getLevel() >= trace.getLevel()) {
            writer.write(message);
        }
    }
}
