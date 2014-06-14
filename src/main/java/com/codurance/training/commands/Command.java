package com.codurance.training.commands;

public abstract class Command {

    abstract public Status execute(CommandParameters parameters);
}
