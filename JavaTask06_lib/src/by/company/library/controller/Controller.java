package by.company.library.controller;

import java.io.IOException;

import by.company.library.command.Command;
import by.company.library.command.exception.CommandException;

public class Controller {
	private final CommandProvider provider = new CommandProvider();
	
	
	public String doAction(String request) throws IOException{
		String commandName;
		
		// parse request and get command name
		/* stub */ commandName = "LOGINATION";
		
		String response;
		try {
			Command command = provider.getCommand(commandName);
			response = command.execute(request);
		} catch (CommandException e) {
			// loggin
			// response with error massage is formed
			/* stub */response = "error";
		}
		
		return response;
		
	}
}