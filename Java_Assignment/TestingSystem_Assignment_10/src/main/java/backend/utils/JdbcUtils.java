package backend.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Singleton pattern
public class JdbcUtils {
    private Connection connection;
    private static JdbcUtils jdbcUtils;

    private JdbcUtils()
    {

    }
    public static JdbcUtils getInstance()
    {
        if (jdbcUtils == null)
        {
            return new JdbcUtils();
        }else {
            return jdbcUtils;
        }
    }

    public Connection connect(String databaseName,String userName, String password) throws SQLException
    {
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        connection = DriverManager.getConnection(url, userName, password);
        return connection;
    }

    public void close() throws SQLException
    {
        if(connection != null && !connection.isClosed())
        {
            connection.close();
        }
    }

}
