package by.company.library.command.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import by.company.library.command.Command;
import by.company.library.command.exception.CommandException;

public class Logination implements Command{

	@Override
	public String execute(String id) throws CommandException, IOException {
		
		String ID;
		String password;
		ID = "2";
		password = "657437";
		System.out.println("\nUser with ID = " + id + " logged in. Launching the withdrawal process of their book(s).");
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
		System.out.println(listOfUsers.get("2"));
		
		System.out.println("\nThese book is free.");
		System.out.println(listOfUsers.get("None"));
		
		AddNewBook b = new AddNewBook();
		b.execute(listOfUsers.get("None"));		
		return null;
	}

}