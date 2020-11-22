package utils;



import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

  private Connection connection;
  private static JDBCUtils jdbcUtils;

  private JDBCUtils()
  {

  }
  public static JDBCUtils getInstance()
  {
      if (jdbcUtils == null)
      {
          return new JDBCUtils();

      }else {
          return jdbcUtils;
      }
  }

  public Connection connect() throws IOException, SQLException {
      Properties properties = new Properties();
      properties.load(new FileInputStream("src/main/resources/database.properties"));
      String url = properties.getProperty("database");
      String username = properties.getProperty("username");
      String password = properties.getProperty("password");
      connection = DriverManager.getConnection(url, username, password);
      return connection;

  }
  public void disconnect() throws SQLException {
      if (connection != null && !connection.isClosed())
      {
          connection.close();
      }

  }



}
