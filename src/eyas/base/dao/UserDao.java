package eyas.base.dao;

import java.util.List;

import eyas.base.bean.UserBean;

public interface UserDao {
	
	public UserBean getUserByUserId(String userId) throws DaoException;
	public List<UserBean> getUserByName(String userName) throws DaoException;
	public UserBean getUserByLoginName(String userLoginName) throws DaoException;
	public void addUser(UserBean user) throws DaoException ;
	public void deleteUser(UserBean user) throws DaoException;
	public void updateUser(UserBean oldUser,UserBean newUser) throws DaoException;
}
