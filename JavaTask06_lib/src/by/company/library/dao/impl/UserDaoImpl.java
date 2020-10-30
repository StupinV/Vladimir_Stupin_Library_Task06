package by.company.library.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import by.company.library.bean.User;
import by.company.library.command.exception.CommandException;
import by.company.library.command.impl.Logination;
import by.company.library.command.impl.Registration;
import by.company.library.dao.UserDao;
import by.company.library.dao.exception.DAOException;
import by.company.library.controller.CommandProvider;


public class UserDaoImpl implements UserDao{
	int[] ID = new int[4];
	@Override
	public User registerUser() throws DAOException {
		// stub
		return new User();
	}
    
	@Override
	public User logination() throws IOException, DAOException, CommandException {
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
		System.out.println("\nLogins and passwords");
		System.out.println("Format : 'Login=Password'");
		System.out.println(listOfUsers);
		
		System.out.println("\nUsers ID:");
		System.out.println("Format : 'ID Name - ID'");
		System.out.println("{ID Alex - 1, ID XQQC - 2, ID Igor - 3, ID Vova - 4}");
		int[] ID = new int[4];
		
		int count = 0;
		for(int j = 0; j < 4; j++) {
			count++;
			ID[j] = count;
		}
		
		Registration r = new Registration();
	
		r.execute(listOfUsers.get("XQQC"));
		return null;
	}
	
}