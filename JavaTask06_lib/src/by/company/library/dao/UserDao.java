package by.company.library.dao;

import java.io.IOException;

import by.company.library.bean.User;
import by.company.library.command.exception.CommandException;
import by.company.library.dao.exception.DAOException;

public interface UserDao {

	public User registerUser() throws DAOException;
	
	public User logination() throws DAOException, IOException, CommandException;
	
}