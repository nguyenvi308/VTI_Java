package com.nguyenvi.backend.presentation;

import com.nguyenvi.backend.bussinesslayer.UserService;
import com.nguyenvi.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Project: TemplateExam
 * Package: com.nguyenvi.backend.presentation
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 8:44 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class UserController {
    private UserService userService ;

    public UserController() throws SQLException, IOException, ClassNotFoundException {
       userService = new UserService();
    }

    public List<User> getList() throws SQLException, ClassNotFoundException {
        return userService.getListUsers();
    }

    public List<User> getUserByProjectName(String projectName) throws SQLException, IOException, ClassNotFoundException {
        return userService.getUserByProjectName(projectName);
    }
    public List<User> getAllManager() throws SQLException, IOException, ClassNotFoundException {
        return userService.getAllManagerService();
    }

    public User login(String email, String password) throws Exception {
        return userService.login(email,password);
    }

}
