package com.nguyenvi.backend.datalayer;

import com.nguyenvi.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
/**
 * Project: ${PROJECT_NAME}
 * Package: ${PACKAGE_NAME}
 * <p>
 * User: Nguyen Vi
 * Date: ${DATE}
 * Time: ${TIME}
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */


public interface IUserRepo {
    List<User> getList() throws SQLException, ClassNotFoundException;

    boolean isUserNameExist(String username);

    User getById(int id) throws SQLException, IOException, ClassNotFoundException;

    User getByUserName(String userName) throws SQLException;

    User login(String userName, String password) throws Exception;

    // Question 2
    List<User> getUserByProjectName(String projectName) throws SQLException, IOException, ClassNotFoundException;
    // Question 3
    public List<User> getAllManager() throws SQLException;

}
