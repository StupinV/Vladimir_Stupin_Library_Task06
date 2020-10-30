package by.company.library.dao.exception;

import java.io.IOException;

public class DAOException extends Exception {
	private static final long serialVersionUID = 1L;

	public DAOException() throws IOException{
		
	}

	public DAOException(Exception e){
		super(e);
		e.printStackTrace();
	}
	
	public DAOException(String message){
		super(message);
	}
	
	public DAOException(String message, Exception e){
		super(message, e);
	}	

}