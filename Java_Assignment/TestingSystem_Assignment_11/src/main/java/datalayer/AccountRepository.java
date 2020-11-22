package datalayer;

import backend.entity.Account;
import backend.interfaces.AccountCRUD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Generate By CMT
 * Project: TestingSystem_Assignment_11
 * Package: datalayer
 * <p>
 * User: Nguyen Vi
 * Date: 17/11/20202
 * Time:
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class AccountRepository implements AccountCRUD<Account> {

    private Connection conn;

    public AccountRepository(Connection conn) {
        this.conn = conn;
    }
    @Override
    public List<Account> getList() throws SQLException {
        String selectAccount = "SELECT * FROM testing_system.account;";
        List<Account> accounts = new ArrayList<>();
        Statement createStatement = conn.createStatement();
        ResultSet accountResultSet = createStatement.executeQuery(selectAccount);
        while(accountResultSet.next())
        {
            int id = accountResultSet.getInt("AccountID");
            String email = accountResultSet.getString("Email");
            String userName = accountResultSet.getString("username");
            String fullName  = accountResultSet.getString("FullName");
            Account  account = new Account(id, email, userName, fullName);
            accounts.add(account);
        }
        return accounts;
    }
    @Override
    public void create() {

    }
    @Override
    public Account getById(int id) throws Exception {
        Account Account = null;
        String sql = "SELECT * FROM Account";
        Statement select = conn.createStatement();
        ResultSet rs = select.executeQuery(sql);
        while(rs.next())
        {
            int accountId = rs.getInt("AccountID");
            String email  = rs.getString("Email");
            String username = rs.getString("username");
            String fullName = rs.getString("FullName");
            if (accountId == id)
            {
                Account account = new Account(accountId,email,username,fullName);
                return account;
            }
        }
        System.err.println("Can not find account with id " + id );
        return null;
    }
    @Override
    public Account getByUserName(String userName) throws Exception {

        String sql = "SELECT * FROM Account";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            int accountId = rs.getInt("AccountID");
            String email = rs.getString("Email");
            String username = rs.getString("username");
            String fullName = rs.getString("FullName");
            if (username.equals(userName)) {
                Account account = new Account(accountId, email, username, fullName);
               return account;
            }
        }
        throw new Exception("Can not find account with " + userName);

    }
    @Override
    public List<Account> getByFullName(String name) throws Exception {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM Account";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            int accountId = rs.getInt("AccountID");
            String email = rs.getString("Email");
            String username = rs.getString("username");
            String fullName = rs.getString("FullName");
            if (fullName.trim().equals(name.trim())) {
                Account account = new Account(accountId, email, username, fullName);
                accounts.add(account);
            }
        }
        return accounts;

    }
    @Override
    public boolean isExists(String userName) throws SQLException {
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
    @Override
    public boolean isExists(int id) throws SQLException {
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
    @Override
    public int update(int id) {
        return 0;
    }
    @Override
    public int delete(int id) throws SQLException {
        String deleteSQLAccount = "DELETE FROM testing_system.account WHERE testing_system.account.AccountID = ? ; ";
        GroupAccountRepository groupAccountRepository = new GroupAccountRepository(conn);
        int a = groupAccountRepository.delete(id);
        PreparedStatement deleteSQLStatement = conn.prepareStatement(deleteSQLAccount);
        deleteSQLStatement.setInt(1,id);
        int b = deleteSQLStatement.executeUpdate();
        return (a+b);

    }


}
