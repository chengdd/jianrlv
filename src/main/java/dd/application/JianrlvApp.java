package dd.application;

import dd.api.resource.UserResource;
import dd.application.filter.AuthFilter;
import dd.application.filter.RuntimeExceptionMapper;
import dd.application.health.MySqlHealthCheck;
import dd.domain.service.UserService;
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

    final SqlSessionFactory sqlSessionFactory =
        new MybatisConfiguration(configuration).getSqlSessionFactory();

    environment.healthChecks()
        .register("mysql-health-check", new MySqlHealthCheck(sqlSessionFactory));

    environment.jersey().register(new AuthFilter());
    environment.jersey().register(new RuntimeExceptionMapper());

    final UserService userService = new UserService(sqlSessionFactory);
    final UserResource userResource = new UserResource(userService);
    environment.jersey().register(userResource);
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
