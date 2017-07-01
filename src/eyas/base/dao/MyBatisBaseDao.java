package eyas.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public abstract class MyBatisBaseDao extends SqlSessionDaoSupport{
	/*protected SqlSession sqlSession;

	public MyBatisBaseDao() {
	}

	public MyBatisBaseDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void setSqlSessionFactory(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}*/

	public void saveObject(String statementId, Object obj) throws DaoException {
		try {
			getSqlSession().insert(statementId, obj);
		} catch (Exception e) {
			throw new DaoException(e);
		} finally {
			// sqlSession.close();
		}
	}

	public List<Object> queryList(String statementId, Object parameter) throws DaoException {
		try {
			return getSqlSession().selectList(statementId, parameter);
		} catch (Exception e) {
			throw new DaoException(e);
		} finally {
			// sqlSession.close();
		}
	}
}
