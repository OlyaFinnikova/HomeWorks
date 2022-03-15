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

    public LevelTrace(String message, int level) {
        this.name = message;
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
        off = new LevelTrace("OFF" + new Date(), 0);
        error = new LevelTrace("ERROR " + new Date(), 1);
        debug = new LevelTrace("DEBUG " + new Date(), 2);
        all = new LevelTrace("ALL " + new Date(), 3);
    }
}
