package com.nguyenvi.backend.bussinesslayer;

import com.nguyenvi.backend.datalayer.IUserRepo;
import com.nguyenvi.backend.datalayer.UserRepo;
import com.nguyenvi.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class UserService implements IUserService{


    private IUserRepo userRepo;

    public UserService() throws SQLException, IOException, ClassNotFoundException {
        this.userRepo = new UserRepo();
    }

    @Override
    public List<User> getListUsers() throws SQLException, ClassNotFoundException {
        return userRepo.getList();
    }

    @Override
    public User getUserById(int id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public int deleteUser(int id) throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public User login(String email, String password) throws Exception {
        return userRepo.login(email, password);
    }

    @Override
    public List<User> getUserByProjectName(String projectName) throws IOException, SQLException, ClassNotFoundException {
        return userRepo.getUserByProjectName(projectName);
    }

    public List<User> getAllManagerService() throws SQLException {

        return userRepo.getAllManager();
    }


}
