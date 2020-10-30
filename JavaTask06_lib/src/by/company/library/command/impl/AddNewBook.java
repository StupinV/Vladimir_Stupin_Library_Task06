package by.company.library.command.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import by.company.library.command.Command;
import by.company.library.command.exception.CommandException;

public class AddNewBook implements Command{

	@Override
	public String execute(String freeBook) throws CommandException, IOException {
		System.out.println("\nStarting the process of adding unoccupied books to the list of user's books.");
	    int i = 0;
		Map<String, String> listOfUsers = new HashMap<String, String>();
		BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Library.Books\\Books.txt"));
				String line = bufReader.readLine(); 
				while (line != null){
					String[] words = line.split(" ");	
				    line = bufReader.readLine();
					for(i = 0; i < 2; i++) 
						   listOfUsers.put(words[0],words[1]);	
						
				}
		System.out.println("\nThese books are now in user's list of books");
		System.out.println(listOfUsers.get("None") + " " +listOfUsers.get("2"));		
		return null;
	}

}