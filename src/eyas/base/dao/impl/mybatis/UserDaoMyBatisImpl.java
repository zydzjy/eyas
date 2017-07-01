package eyas.base.dao.impl.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import eyas.base.bean.UserBean;
import eyas.base.dao.DaoException;
import eyas.base.dao.MyBatisBaseDao;
import eyas.base.dao.UserDao;

public class UserDaoMyBatisImpl extends MyBatisBaseDao implements UserDao {
	public final static String MYSQL_STATEMENT_ADD_USER = "eyas.base.bean.user.addUser";
	public final static String MYSQL_STATEMENT_QUERY_USER = "eyas.base.bean.user.queryUser";
	public final static String MYSQL_STATEMENT_QUERY_USER_LOGINNAME = "eyas.base.bean.user.queryUserByUserLoginName";
	
	public UserDaoMyBatisImpl(){}
	
	/*public UserDaoMyBatisImpl(SqlSessionFactory factory) {
		super(factory);
	}*/
	
	@Override
	public UserBean getUserByUserId(String userId) throws DaoException {
		List<Object> userList = super.queryList(MYSQL_STATEMENT_QUERY_USER, userId);
		if(userList != null && userList.size()>0){
			return (UserBean)userList.get(0);
		}else{
			return null; 
		}
	}

	@Override
	public List<UserBean> getUserByName(String userName) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(UserBean user) throws DaoException {
		super.saveObject(MYSQL_STATEMENT_ADD_USER, user);
	}

	@Override
	public void deleteUser(UserBean user) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(UserBean oldUser, UserBean newUser)
			throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public UserBean getUserByLoginName(String userLoginName)
			throws DaoException {
		List<Object> userList = super.queryList(MYSQL_STATEMENT_QUERY_USER_LOGINNAME, userLoginName);
		if(userList != null && userList.size()>0){
			return (UserBean)userList.get(0);
		}else{
			return null; 
		}
	}

}
