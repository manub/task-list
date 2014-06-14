package com.codurance.training.commands;

public class QuitCommand extends Command {

    @Override
    public Status execute(CommandParameters parameters) {
        return Status.QUIT;
    }
}
