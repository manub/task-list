package com.codurance.training.commands;

import java.io.PrintWriter;

public class CommandFactory {
    public static Command read(String commandString, PrintWriter out) {
        switch (commandString) {
            case "show":
                return new ShowCommand(out);
            case "quit":
                return new QuitCommand();
            default:
                return null;
        }
    }
}
