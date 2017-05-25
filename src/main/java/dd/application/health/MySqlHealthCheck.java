package dd.application.health;

import com.codahale.metrics.health.HealthCheck;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dd on 2017/5/24.
 */
public class MySqlHealthCheck extends HealthCheck {

  private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheck.class);
  private final SqlSessionFactory sqlSessionFactory;

  public MySqlHealthCheck(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  protected Result check() {
    Connection conn  = sqlSessionFactory.openSession().getConnection();
    Statement stmt = null;
    ResultSet rs = null;
    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery("select 1 as rs");
      while (rs.next()) {
        if (rs.getInt("rs") == 1) {
          LOGGER.info("MYSQL: connection is ok !");
          return Result.healthy();
        } else {
          return Result.unhealthy("");
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
      return Result.unhealthy(e);
    } finally {
      try {
        if (rs != null) {
          rs.close();
        }
        if (stmt != null) {
          stmt.close();
        }
      } catch (Exception e) {
        LOGGER.error("", e);
      }
    }
    return Result.unhealthy("");
  }
}
