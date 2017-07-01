package eyas.base.service;

import eyas.base.bean.UserExtBean;

public interface UserExtService {
	
	public void addUserExt(UserExtBean user) throws ServiceException ;
	public void deleteUserExt(UserExtBean user) throws ServiceException;
	public void updateUserExt(UserExtBean oldUser,UserExtBean newExtUser) throws ServiceException;
}
