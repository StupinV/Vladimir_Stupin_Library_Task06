package by.company.library.dao;

import java.io.IOException;

import by.company.library.bean.Book;
import by.company.library.dao.exception.DAOException;

public interface BookDao {
	
	public Book addBook() throws IOException ;

}