package com.codurance.training.commands;

public class CommandFactory {
    public static Command read(String commandString) {
        switch (commandString) {
            case "quit":
                return new QuitCommand();
            default:
                return null;
        }
    }
}
