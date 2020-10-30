package by.company.library.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import by.company.library.bean.Book;
import by.company.library.dao.BookDao;
import by.company.library.dao.exception.DAOException;

public class BookDaoImpl implements BookDao {

	@Override
	public Book addBook() throws IOException {
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
		bufReader.close();
		System.out.println("Books and ID of people who took them");
		System.out.println("Format : 'Book Name=ID'");
		System.out.println(listOfUsers);
		
		return null;
		
	}

}