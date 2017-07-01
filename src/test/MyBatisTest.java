package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import eyas.base.bean.UserBean;
import eyas.base.dao.UserDao;
import eyas.base.dao.impl.mybatis.UserDaoMyBatisImpl;
import eyas.base.service.UserService;
import eyas.base.service.impl.SimpleUserServiceImpl;

public class MyBatisTest {

	public static void main(String[] args) {
		String resource = "resources/sql/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			UserDao userDao = new UserDaoMyBatisImpl();
			UserService userService = new SimpleUserServiceImpl(userDao);
			UserBean newUser = new UserBean();
			newUser.setUserId(11L);
			newUser.setUserName("ÕÅÈý");
			newUser.setUserPwd("123");
			//userService.addUser(newUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
