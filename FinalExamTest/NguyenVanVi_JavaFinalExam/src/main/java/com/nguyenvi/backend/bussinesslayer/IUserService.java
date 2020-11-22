package com.nguyenvi.backend.bussinesslayer;

import com.nguyenvi.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Project: TemplateExam
 * Package: com.nguyenvi.backend.bussinesslayer
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 8:45 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface IUserService {
    List<User> getListUsers() throws SQLException, ClassNotFoundException;

    User getUserById(int id) throws SQLException, ClassNotFoundException;

    int deleteUser(int id) throws ClassNotFoundException, SQLException;

    boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException;

    User login(String email, String password) throws Exception;
    List<User> getUserByProjectName(String projectName) throws IOException, SQLException, ClassNotFoundException;
}
