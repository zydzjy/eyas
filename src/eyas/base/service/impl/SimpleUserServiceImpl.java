package eyas.base.service.impl;

import java.util.List;

import eyas.base.bean.UserBean;
import eyas.base.bean.UserExtBean;
import eyas.base.dao.DaoException;
import eyas.base.dao.UserDao;
import eyas.base.service.ServiceException;
import eyas.base.service.UserExtService;
import eyas.base.service.UserService;

public class SimpleUserServiceImpl implements UserService {

	protected UserDao userDao;
	protected UserExtService userExtService;

	public SimpleUserServiceImpl() {
	}

	public SimpleUserServiceImpl(UserDao dao) {
		this.userDao = dao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserExtService getUserExtService() {
		return userExtService;
	}

	public void setUserExtService(UserExtService userExtService) {
		this.userExtService = userExtService;
	}

	@Override
	public UserBean getUserByUserId(String userId) throws ServiceException {
		UserBean user;
		try {
			// user = this.userDao.getUserByUserId(userId);
			user = this.userDao.getUserByLoginName(userId);
		} catch (DaoException e) {
			throw new ServiceException(ServiceException.DAO_EXCEPTION_MYBATIS_BASE, "database error");
		}
		if (user == null) {
			throw new ServiceException(ServiceException.DAO_EXCEPTION_NO_INSTANCE, "no such instance");
		}
		return user;
	}

	@Override
	public List<UserBean> getUserByName(String userName) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(UserBean user, UserExtBean userExt) throws ServiceException {
		try {
			this.userDao.addUser(user);
			userExt.setUserId(user.getUserId());
			this.userExtService.addUserExt(userExt);
		} catch (DaoException e) {
			throw new ServiceException(ServiceException.DAO_EXCEPTION_MYBATIS_BASE, e.getMessage());
		}
	}

	@Override
	public void deleteUser(UserBean user) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(UserBean oldUser, UserBean newUser) throws ServiceException {
		// TODO Auto-generated method stub

	}

}
