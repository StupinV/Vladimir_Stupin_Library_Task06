package by.company.library.command;

import java.io.IOException;

import by.company.library.command.exception.CommandException;

public interface Command {

	String execute(String request) throws CommandException, IOException;
}