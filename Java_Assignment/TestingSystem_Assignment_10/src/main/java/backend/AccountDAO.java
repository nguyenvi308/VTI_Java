package backend;

import entity.Account;
import entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountDAO {

    private Connection conn;

    public AccountDAO(Connection conn) {
        this.conn = conn;
    }

    // Question 1
    public List<Account> getAccounts() throws Exception
    {
        List<Account> accounts = new ArrayList<>();
        DepartmentDAO departmentDAO = new DepartmentDAO(conn);
        String sql = "SELECT * FROM account";
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);

        while(rs.next())
        {
            int accountId = rs.getInt("AccountID");
            String email  = rs.getString("Email");
            String fullName = rs.getString("FullName");
            int departmentId = rs.getInt("DepartmentID");
            Department department = departmentDAO.getByDepartmentId(departmentId);
            String departmentName = department.getDepartmentName();
            Date date = rs.getDate("CreateDate");
            Account account = new Account(accountId,email,fullName,departmentName,date);
            accounts.add(account);
        }
        return accounts;
    }

    // Question 2-3
    public Account getAccountById(int id) throws Exception
    {
        Account Account = null;
        String sql = "SELECT * FROM Account";
        DepartmentDAO departmentDAO = new DepartmentDAO(conn);
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);
        while(rs.next())
        {
            int accountId = rs.getInt("AccountID");
            String email  = rs.getString("Email");
            String fullName = rs.getString("FullName");
            int departmentId = rs.getInt("DepartmentID");
            Department department = departmentDAO.getByDepartmentId(departmentId);
            String departmentName = department.getDepartmentName();

            Date date = rs.getDate("CreateDate");
            if (accountId == id)
            {
                Account account = new Account(accountId,email,fullName,departmentName,date);
                return account;
            }
        }
        throw new Exception("Cannot find Account which has id = " + id);
    }


    // Question 4
    public boolean isAccountUserNameExists(String userName) throws SQLException {
        String sql = "SELECT * FROM Account";
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);
        while (rs.next()) {
            String name1 = rs.getString(3);
            if (name1.equals(userName)) {

                return true;
            }
        }
        return false;
    }
    public boolean isAccountIdExists(int id) throws SQLException {
        String sql = "SELECT * FROM Account";
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);
        while (rs.next()) {
            int accountId = rs.getInt(1);
            if (accountId == id) {
                return true;
            }
        }
        return false;
    }

    // Question 6 Update
    public int createAccount(String userName) throws Exception {
        int a = 0;
        if (isAccountUserNameExists(userName))
        {
            throw new Exception("Account User Name is Exist !");
        }else
        {
            PreparedStatement preparedStatement = conn.prepareStatement("insert into Account(AccountName) value (?)");
            preparedStatement.setString(1,userName);
            a  = preparedStatement.executeUpdate();
        }
        return a;
    }

    // Question 7
    public int deleteAccountById(int id) throws Exception {
        int a = 0;
        if (isAccountIdExists(id)) {
            PreparedStatement preparedStatement = conn.prepareStatement("delete from Account where AccountID = ?");
            preparedStatement.setInt(1, id);
            a = preparedStatement.executeUpdate();
            return a;
        } else {
            throw new Exception("Cannot find Account which has id = " + id);
        }

    }
}
