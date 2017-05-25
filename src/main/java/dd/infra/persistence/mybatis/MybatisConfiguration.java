package dd.infra.persistence.mybatis;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import dd.infra.conf.JianrlvConfiguration;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

/**
 * Created by dd on 2017/5/23.
 */
public class MybatisConfiguration {

  private final JianrlvConfiguration conf;

  public MybatisConfiguration(JianrlvConfiguration conf) {
    this.conf = conf;
  }

  public SqlSessionFactory getSqlSessionFactory() throws Exception {
    ComboPooledDataSource dataSource = new ComboPooledDataSource();
    dataSource.setDriverClass(conf.getJdbc().getDriver());
    dataSource.setInitialPoolSize(conf.getJdbc().getInitialPoolSize());
    dataSource.setAcquireIncrement(conf.getJdbc().getAcquireIncrement());

    Environment env = new Environment("default", new JdbcTransactionFactory(), dataSource);

    Configuration mc = new Configuration();
    mc.setEnvironment(env);

    return new DefaultSqlSessionFactory(mc);
  }

}
