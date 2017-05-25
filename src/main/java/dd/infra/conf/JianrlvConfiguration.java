package dd.infra.conf;

import io.dropwizard.Configuration;

/**
 * Created by dd on 2017/5/23.
 */
public class JianrlvConfiguration extends Configuration {


  private Jdbc jdbc;

  public Jdbc getJdbc() {
    return jdbc;
  }

  public void setJdbc(Jdbc jdbc) {
    this.jdbc = jdbc;
  }

  public class Jdbc {

    private String username;
    private String password;
    private String driver;
    private String url;

    private int acquireIncrement = 10;
    private int initialPoolSize = 10;
    private int minPoolSize = 10;
    private int maxPoolSize = 50;

    public int getAcquireIncrement() {
      return acquireIncrement;
    }

    public void setAcquireIncrement(int acquireIncrement) {
      this.acquireIncrement = acquireIncrement;
    }

    public int getInitialPoolSize() {
      return initialPoolSize;
    }

    public void setInitialPoolSize(int initialPoolSize) {
      this.initialPoolSize = initialPoolSize;
    }

    public int getMinPoolSize() {
      return minPoolSize;
    }

    public void setMinPoolSize(int minPoolSize) {
      this.minPoolSize = minPoolSize;
    }

    public int getMaxPoolSize() {
      return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
      this.maxPoolSize = maxPoolSize;
    }

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public String getDriver() {
      return driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
  }

}
