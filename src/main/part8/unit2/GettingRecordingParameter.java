package part8.unit2;

import java.util.Map;

public class GettingRecordingParameter {

    public Writing getKey(Map<String, String> map) {

        if ("console".equals(map.get("place"))){
            return new WritingInConsole();
        }else{
            return new WritingInFile();
        }
    }
}
