package com.codurance.training.commands;

import com.codurance.training.infra.ShowService;
import com.codurance.training.tasks.Tasks;

import java.io.PrintWriter;

public class ShowCommand extends Command {

    private final ShowService showService;

    public ShowCommand(PrintWriter out) {
        showService = new ShowService(out);
    }

    @Override
    public Status execute(Tasks tasks) {
        showService.show(tasks);
        return Status.NONE;
    }
}
