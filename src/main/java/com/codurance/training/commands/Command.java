package com.codurance.training.commands;

import com.codurance.training.tasks.Tasks;

public abstract class Command {

    abstract public Status execute(Tasks parameters);
}
