package eyas.base.dao.impl.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import eyas.base.bean.UserBean;
import eyas.base.bean.UserExtBean;
import eyas.base.dao.DaoException;
import eyas.base.dao.MyBatisBaseDao;
import eyas.base.dao.UserDao;
import eyas.base.dao.UserExtDao;

public class UserExtDaoMyBatisImpl extends MyBatisBaseDao implements UserExtDao {
	public final static String MYSQL_STATEMENT_ADD_USER = "eyas.base.bean.user.addUserExt";
	public UserExtDaoMyBatisImpl(){}
	
	@Override
	public void addUserExt(UserExtBean user) throws DaoException {
		super.saveObject(MYSQL_STATEMENT_ADD_USER, user);
	}

	@Override
	public void deleteUserExt(UserExtBean user) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUserExt(UserExtBean oldUser, UserExtBean newUser)
			throws DaoException {
		// TODO Auto-generated method stub

	}
}
