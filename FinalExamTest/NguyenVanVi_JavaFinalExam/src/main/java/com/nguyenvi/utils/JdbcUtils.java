package com.nguyenvi.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static java.lang.Class.forName;

public class JdbcUtils {
    private Properties properties;
    private Connection connection;

    public JdbcUtils() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        properties = new Properties();
        properties.load(new FileInputStream("src\\main\\res\\database.properties"));
        connect();
    }

    public Connection connect() throws ClassNotFoundException, SQLException {
        if (connection != null && !connection.isClosed()) {
            return connection;
        }

        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        // Step 1: register the driver class with DriverManager
        Class.forName(driver);

        // Step 2: get a Database Connection
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

}
