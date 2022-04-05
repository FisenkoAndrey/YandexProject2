package utiliities;

import java.util.HashMap;

public class Storage {
    static HashMap<String, String> storage = new HashMap<>();

    public static void setVar(String varName, String varValue) {
        storage.put(varName, varValue);
    }

    public static String getVar(String varName) {
        return storage.get(varName);
    }
}

