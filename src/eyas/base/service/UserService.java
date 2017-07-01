package eyas.base.service;

import java.util.List;

import eyas.base.bean.UserBean;
import eyas.base.bean.UserExtBean;

public interface UserService {

	public UserBean getUserByUserId(String userId) throws ServiceException;

	public List<UserBean> getUserByName(String userName) throws ServiceException;

	//public void addUser(UserBean user, UserExtBean userExt) throws ServiceException;

	public void addUser(UserBean user, UserExtBean userExt) throws ServiceException;

	public void deleteUser(UserBean user) throws ServiceException;

	public void updateUser(UserBean oldUser, UserBean newUser) throws ServiceException;
}
