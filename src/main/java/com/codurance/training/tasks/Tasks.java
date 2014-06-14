package com.codurance.training.tasks;

import com.google.common.collect.ImmutableList;

import java.util.*;

public class Tasks {

    private final Map<String, List<Task>> tasks = new LinkedHashMap<>();

    public static Tasks create() {
        return new Tasks();
    }

    public void put(String name, ArrayList<Task> tasks) {
        this.tasks.put(name, tasks);
    }

    //TODO: I want to be immutable
    public List<Task> get(String project) {
        return tasks.get(project);
    }

    public Set<Map.Entry<String, List<Task>>> entrySet() {
        return tasks.entrySet();
    }
}
