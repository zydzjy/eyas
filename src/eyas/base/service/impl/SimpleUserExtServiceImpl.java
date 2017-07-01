package eyas.base.service.impl;

import java.util.List;

import eyas.base.bean.UserBean;
import eyas.base.bean.UserExtBean;
import eyas.base.dao.DaoException;
import eyas.base.dao.UserDao;
import eyas.base.dao.UserExtDao;
import eyas.base.service.ServiceException;
import eyas.base.service.UserExtService;
import eyas.base.service.UserService;

public class SimpleUserExtServiceImpl implements UserExtService {
	
	protected UserExtDao userExtDao;
	
	public SimpleUserExtServiceImpl(){}
	public SimpleUserExtServiceImpl(UserExtDao dao){
		this.userExtDao = dao;
	}
	
	public UserExtDao getUserExtDao() {
		return userExtDao;
	}

	public void setUserExtDao(UserExtDao userExtDao) {
		this.userExtDao = userExtDao;
	}

	@Override
	public void addUserExt(UserExtBean user) throws ServiceException {
		try {
			this.userExtDao.addUserExt(user);
		} catch (DaoException e) {
			throw new ServiceException(ServiceException.DAO_EXCEPTION_MYBATIS_BASE,e.getMessage());
		}
	}

	@Override
	public void deleteUserExt(UserExtBean user) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUserExt(UserExtBean oldUser, UserExtBean newUser)
			throws ServiceException {
		// TODO Auto-generated method stub

	}

}
