package datalayer;

import backend.entity.Group;
import backend.interfaces.CRUD;
import utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GroupAccountRepository implements CRUD<Group> {
    private Connection connection;

    public GroupAccountRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List getList() throws SQLException {
        String selectGroup = "SELECT * FROM testing_system.grouptable;";
        List<Group> groups  = new ArrayList<>();
        Statement createStatement = connection.createStatement();
        ResultSet groupResultSet = createStatement.executeQuery(selectGroup);
        while(groupResultSet.next())
        {
            int id = groupResultSet.getInt("GroupID");
            String groupName = groupResultSet.getString("GroupName");
            Group  group  = new Group(id, groupName);
            groups.add(group);
        }
        return groups;
    }

    @Override
    public void create() {

    }

    @Override
    public Group getById(int id) {
        return null;
    }

    @Override
    public boolean isExists(String userName) throws SQLException {
        String sql = "SELECT * FROM grouptable";
        Statement select = connection.createStatement();
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
        String sql = "SELECT * FROM grouptable";
        Statement select = connection.createStatement();
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
    public int  delete(int id) throws SQLException {
        String deleteSQLGroupAccount = "DELETE FROM testing_system.groupaccount WHERE " +
                "testing_system.groupaccount.groupid = ?; ";
        PreparedStatement statement  = connection.prepareStatement(deleteSQLGroupAccount);
        statement.setInt(1,id);
        int a = statement.executeUpdate();
        return a;

    }
}
