package com.codurance.training.infra;

import com.codurance.training.tasks.Task;
import com.codurance.training.tasks.Tasks;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class ShowService {

    private PrintWriter out;

    public ShowService(PrintWriter out) {
        this.out = out;
    }

    public void show(Tasks tasks) {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            out.println(project.getKey());
            for (Task task : project.getValue()) {
                out.printf("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
            }
            out.println();
        }

    }
}
