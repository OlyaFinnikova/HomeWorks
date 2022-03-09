package part8.unit2;

public class App {
    public static void main(String[] args) {
        LevelTrace levelTrace = new LevelTrace();
        Logger logger = new Logger();
        logger.log(levelTrace.trace,new UserLogger().getUserLogger(levelTrace.trace));
    }
}
