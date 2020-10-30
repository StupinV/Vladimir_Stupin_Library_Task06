package by.company.library.service.impl;

import by.company.library.dao.DAOFactory;
import by.company.library.dao.UserDao;
import by.company.library.dao.exception.DAOException;
import by.company.library.dao.impl.UserDaoImpl;
import by.company.library.service.UserService;
import by.company.library.service.exception.ServiceException;

public class UserServiceImpl implements UserService{

	@Override
	public void logination(String login, String password) throws ServiceException {
		// parameters validation
		
		DAOFactory daoFactory = DAOFactory.getInstance();
		UserDao userDAO = daoFactory.getUserDAO();
		
		
		//UserDao userDAO = UserDaoImpl.getInstance(); try { userDAO.logination(login,
		//password); } catch (DAOException e) { throw new ServiceException(e); }
		
		
	}

}
