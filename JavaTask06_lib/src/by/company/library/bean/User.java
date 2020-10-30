package by.company.library.bean;

import java.io.IOException;
import java.util.List;

import by.company.library.command.exception.CommandException;
import by.company.library.controller.CommandProvider;
import by.company.library.dao.exception.DAOException;
import by.company.library.dao.impl.UserDaoImpl;

public class User {

    private String login;
    private String password;
    
    public static void main(String[] args) throws IOException, DAOException, CommandException {
    	UserDaoImpl u = new UserDaoImpl();
    	Book b = new Book();
    	CommandProvider c = new CommandProvider();
    	b.book();
    	u.logination();
    	c.getCommand("LOGINATION");
    }      
    
}
