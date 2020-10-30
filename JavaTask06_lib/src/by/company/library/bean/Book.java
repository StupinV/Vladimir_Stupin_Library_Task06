package by.company.library.bean;

import java.io.IOException;

import by.company.library.dao.impl.BookDaoImpl;

public class Book {
	public void book() throws IOException {
		User b = new User();
		BookDaoImpl c = new BookDaoImpl();
    	c.addBook();
	}
}
