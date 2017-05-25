package dd.domain.service;

import dd.domain.model.User;
import dd.infra.persistence.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by dd on 2017/5/25.
 */
public class UserService {

  private SqlSessionFactory sqlSessionFactory;
  public UserService(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  public User getUser(int userId) {
    try (SqlSession session = sqlSessionFactory.openSession()) {
      return session.getMapper(UserMapper.class).selectOne(userId);
    }
  }
}
