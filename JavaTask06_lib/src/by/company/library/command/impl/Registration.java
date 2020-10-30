package by.company.library.command.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import by.company.library.command.Command;
import by.company.library.command.exception.CommandException;

public class Registration implements Command {

	@Override
	public String execute(String Password) throws CommandException, IOException {
	    int i = 0;
		Map<String, String> listOfUsers = new HashMap<String, String>();
		BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Library.Users\\User.txt"));
				String line = bufReader.readLine(); 
				while (line != null){
					String[] words = line.split(" ");	
				    line = bufReader.readLine();
					for(i = 0; i < 2; i++) 
						listOfUsers.put(words[0],words[1]);				
				}
		bufReader.close();
		
		int[] ID = new int[4];
		
		int count = 0;
		for(int j = 0; j < 4; j++) {
			count++;
			ID[j] = count;
		}
		
		int newPassword = Integer.parseInt(Password);
		int password = Integer.parseInt(listOfUsers.get("XQQC"));
		if (newPassword == password) {
		   System.out.println("Password is correct.");
		   String log_ID = String.valueOf(ID[1]);
		   Logination l = new Logination();
		   l.execute(log_ID);
		}
		
		return null;
	}

}