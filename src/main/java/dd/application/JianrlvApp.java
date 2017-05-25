package dd.application;

import dd.application.filter.AuthFilter;
import dd.application.health.MySqlHealthCheck;
import dd.infra.conf.JianrlvConfiguration;
import dd.infra.persistence.mybatis.MybatisConfiguration;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dd on 2017/5/23.
 */
public class JianrlvApp extends Application<JianrlvConfiguration> {

  private static final Logger LOGGER = LoggerFactory.getLogger(JianrlvApp.class);

  public static void main(String[] args) throws Exception {
    new JianrlvApp().run(args);
    LOGGER.info("app started !");
  }

  @Override
  public void run(JianrlvConfiguration configuration, Environment environment) throws Exception {

    SqlSessionFactory sqlSessionFactory =
        new MybatisConfiguration(configuration).getSqlSessionFactory();

    environment.healthChecks()
        .register("mysql-health-check", new MySqlHealthCheck(sqlSessionFactory));

    environment.jersey().register(new AuthFilter());
  }

  @Override
  public String getName() {
    return "Jianrlv";
  }

  @Override
  public void initialize(Bootstrap<JianrlvConfiguration> bootstrap) {
    bootstrap.addBundle(new AssetsBundle("/assets"));
  }
}
