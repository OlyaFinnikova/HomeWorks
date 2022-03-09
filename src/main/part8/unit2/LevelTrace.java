package part8.unit2;

import java.util.Date;

public class LevelTrace {

    public String name;
    public int level;
    public static LevelTrace off;
    public static LevelTrace error;
    public static LevelTrace debug;
    public static LevelTrace all;

    public LevelTrace() {
    }

    public LevelTrace(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    static {
        off = new LevelTrace("OFF", 0);
        error = new LevelTrace("ERROR", 1);
        debug = new LevelTrace("DEBUG", 2);
        all = new LevelTrace("ALL", 3);
    }

    public LevelTrace[] trace = new LevelTrace[]{
           off,
           error,
           debug,
           all};
}
