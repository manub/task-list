package com.codurance.training.commands;

import java.util.HashMap;
import java.util.Map;

public class CommandParameters {

    private final Map<String, Object> params = new HashMap<>();

    public Object get(String key) {
        return params.get(key);
    }

    public void add(String key, Object parameter) {
        params.put(key, parameter);
    }
}
