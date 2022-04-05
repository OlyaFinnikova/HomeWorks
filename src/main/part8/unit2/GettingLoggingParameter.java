package part8.unit2;

import java.util.Map;

public class GettingLoggingParameter {

    public LevelTrace getKey(Map<String, String> map){

        switch (map.get("level")) {
            case "error":
                return new LevelTrace().error;
            case "debug":
                return new LevelTrace().debug;
            case "all":
                return new LevelTrace().all;
            default:
                return new LevelTrace().off;
        }
    }
}
