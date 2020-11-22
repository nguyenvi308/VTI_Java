package com.nguyenvi.frontend;

import com.nguyenvi.backend.presentation.UserController;
import com.nguyenvi.entity.User;
import com.nguyenvi.utils.ScannerUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Project: TemplateExam
 * Package: com.nguyenvi.frontend
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 9:51 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Function {

    private UserController userController;

    public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        userController = new UserController();
    }

    public void getAllManager() throws ClassNotFoundException, SQLException, IOException {
        List<User> users = userController.getAllManager();
        System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password");
        for (User user : users) {
            System.out.printf("%-15s %-25s %-25s %-25s\n", user.getUserID(), user.getEmail(), user.getFullName(),
                    "*********");
        }
    }
    public  void getAllManagerAndEmployee(String providerName) throws SQLException, IOException, ClassNotFoundException {
        List<User> users = userController.getUserByProjectName(providerName);
        System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password");
        for (User user : users) {
            System.out.printf("%-15s %-25s %-25s %-25s\n", user.getUserID(), user.getEmail(), user.getFullName(),
                    "*********");
        }
    }

    public User login() throws ClassNotFoundException, SQLException {
        while (true) {
            System.out.print("Mời bạn nhập vào Email của account: ");
            String email = ScannerUtils.inputEmail("Email chưa đúng định dạng.");

            System.out.print("Mời bạn nhập password: ");
            String password = ScannerUtils
                    .inputPassword("Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!");
            try {
                return userController.login(email, password);

            } catch (Exception e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
    }

}
