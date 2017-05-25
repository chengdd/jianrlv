package dd.infra.persistence.mybatis.mapper;

import dd.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by dd on 2017/5/25.
 */
@Mapper
public interface UserMapper {
  @Select("select user_id, phone, username, create_time from user where user_id=#{userId}")
  User selectOne(@Param("userId") int userId);
}
