package com.tictactoc.thegame.utility;

import java.util.Map;

public class EnvironmentVariableUtility {
    public static String getEnv(String name) {
        Map<String, String> map = System.getenv();
        String value = map.get(name);
        return value;
    }
}
