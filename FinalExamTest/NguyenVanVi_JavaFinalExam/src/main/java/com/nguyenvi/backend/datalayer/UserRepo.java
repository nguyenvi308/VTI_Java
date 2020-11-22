package com.nguyenvi.backend.datalayer;

import com.nguyenvi.entity.User;
import com.nguyenvi.utils.JdbcUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: TemplateExam
 * Package: com.nguyenvi.backend.datalayer
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 10:39 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class UserRepo implements IUserRepo {


    private JdbcUtils jdbcUtils;
    private Connection connection;

    public UserRepo() throws SQLException, IOException, ClassNotFoundException {
        this.jdbcUtils = new JdbcUtils();
    }

    @Override
    public List<User> getList() throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<>();
        try {
            connection = jdbcUtils.connect();
            Statement statement = connection.createStatement();
            String listUser = "SELECT * FROM employee_manager.user";
            ResultSet resultSet = statement.executeQuery(listUser);
            while (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String fullName = resultSet.getString("FullName");
                String email = resultSet.getString("Email");
                String password = resultSet.getString("Password");
                User user = new User(userId, fullName, email, password);
                users.add(user);
            }
            return users;
        } finally {
            connection.close();
        }

    }

    @Override
    public boolean isUserNameExist(String username) {
        return false;
    }
    @Override
    public User getById(int id) throws SQLException, IOException, ClassNotFoundException {

            connection = jdbcUtils.connect();

            String sql = " SELECT * " + " FROM `User` " + " WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String fullName = resultSet.getString("FullName");
                String email = resultSet.getString("Email");
                String password = resultSet.getString("Password");
                User user = new User(userId, fullName, email, password);
                return user;
            }
            return null;

        }


    @Override
    public User getByUserName(String userName) throws SQLException {
        return null;
    }

    @Override
    public User login(String email, String password) throws Exception {
        try {

            connection = jdbcUtils.connect();
            String sql = "SELECT * FROM employee_manager.user WHERE Email = ? AND Password = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String fullName = resultSet.getString("FullName");
                String email1 = resultSet.getString("Email");
                String password2 = resultSet.getString("Password");
                User user = new User(userId, fullName, email1, password2);
                return user;
            } else {
                throw new Exception("Tai khoan hoac mat khau sai!");
            }
        }
        finally {
            connection.close();
        }
    }

//    Question 2
    @Override
    public List<User> getUserByProjectName(String projectName) throws SQLException, IOException, ClassNotFoundException {
        List<User> users = new ArrayList<>();
        try {
            // get connect
            connection = jdbcUtils.connect();
            // Execute query
            String listUser = "SELECT \n" +
                    "    project.projectName , manager.id as 'Manager', employee.id as 'Employee'\n" +
                    "FROM\n" +
                    "    employee_manager.project_working\n" +
                    "        JOIN\n" +
                    "    manager ON project_working.managerId = manager.id\n" +
                    "        JOIN\n" +
                    "    employee ON project_working.employeeId = employee.id\n" +
                    "        JOIN\n" +
                    "    project ON project_working.projectId = project.projectId\n" +
                    "WHERE\n" +
                    "    project.projectName = ?; ";

            PreparedStatement prepStmt = connection.prepareStatement(listUser);
            prepStmt.setString(1, projectName);

            ResultSet resultSet = prepStmt.executeQuery();
            while (resultSet.next()) {
                int manager = resultSet.getInt(2);
                int employee = resultSet.getInt(3);

                User managerE = getById(manager);
                User employeeE = getById(employee);

                if (!inList(users, managerE)) {
                    users.add(managerE);
                }
                if (!inList(users, employeeE)) {
                    users.add(employeeE);
                }
            }
            return users;
        }finally {
            connection.close();
        }

    }
// Question 3
    @Override
    public List<User> getAllManager() throws SQLException {
        List<User> users = new ArrayList<>();

        try {
            connection = jdbcUtils.connect();
            String sql = "select distinct( manager.id ), project.projectName  from manager " +
                    " join project_working on manager.id = project_working.managerId " +
                    "join project on project_working.projectid = project.projectId; \n";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int managerID = resultSet.getInt(1);
                User user = getById(managerID);
                users.add(user);
            }
            return users;

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return users;
    }

    // Check if user in the list
    private boolean inList(List<User> users, User user1) {
        for (User user : users) {
            if (user.getUserID() == user1.getUserID()) {
                return true;
            }
        }
        return false;
    }


}
