package frontend;

import backend.AccountDAO;
import backend.DepartmentDAO;
import backend.utils.JdbcUtils;
import entity.Account;
import entity.Department;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws Exception {
        JdbcUtils jdbcUtils = JdbcUtils.getInstance();



        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/config.properties"));
        String databaseName = properties.getProperty("database");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        Connection conn = jdbcUtils.connect(databaseName, username, password);

        System.out.println("List of accounts : ");
        AccountDAO accountDAO = new AccountDAO(conn);
        List<Account> accounts = accountDAO.getAccounts();
        accounts.forEach(System.out::println);


        System.out.println("List of department : ");
        DepartmentDAO departmentDAO = new DepartmentDAO(conn);
        List<Department> departments = departmentDAO.getDepartments();
        departments.forEach(System.out::println);


        System.out.println("Find Account By Id: " );
        Account Account = accountDAO.getAccountById(8);
        System.out.println(Account);
        jdbcUtils.close();






    }
}
