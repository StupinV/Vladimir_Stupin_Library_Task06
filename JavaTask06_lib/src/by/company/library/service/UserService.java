package by.company.library.service;

import by.company.library.service.exception.ServiceException;

public interface UserService {
	
	void logination(String login, String password) throws ServiceException;
	
}