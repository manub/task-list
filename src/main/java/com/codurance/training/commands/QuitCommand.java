package com.codurance.training.commands;

import com.codurance.training.tasks.Tasks;

public class QuitCommand extends Command {

    @Override
    public Status execute(Tasks parameters) {
        return Status.QUIT;
    }
}
