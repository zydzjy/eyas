package eyas.base.dao;

import eyas.base.bean.UserExtBean;
import eyas.base.service.ServiceException;

public interface UserExtDao {
	
	public void addUserExt(UserExtBean user) throws DaoException ;
	public void deleteUserExt(UserExtBean user) throws DaoException;
	public void updateUserExt(UserExtBean oldUser,UserExtBean newExtUser) throws DaoException;
}
