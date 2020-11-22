package com.nguyenvi.frontend;

import com.nguyenvi.entity.User;
import com.nguyenvi.utils.ScannerUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        menuLogin();
    }

    private static void menuLogin() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
        Function function = new Function();
        System.out.println("MỜI BẠN LOGIN");
        User user = function.login();
        System.out.println("Login successfull!");
        System.out.println("Chào mừng " + user.getFullName() + "!");
        System.out.println("Mời chọn chức năng : ");
        System.out.println("1. Các nhân viên và quản lý  trong project");
        System.out.println("2. Tất cả Manager của các project");
        System.out.println("3. Terminate");
        outer: while (true) {
            System.out.print("Moi ban nhap chuc nang: ");
            int choose = ScannerUtils.inputFunction(1, 5, "Ban chi duoc chon tu 1 --> 3. Mời nhập lại!");
            switch (choose) {
                case 1: {
                    System.out.println("Enter project name : ");
                    String projectName = ScannerUtils.inputString("Opp, some thing go wrong !");
                    System.out.println("Tất cả nhân viên và quản lý trong project:" + projectName);
                    function.getAllManagerAndEmployee(projectName);
                    break;
                }
                case 2:
                    System.out.println("Tất cả các quản lý có trong các project: ");
                    function.getAllManager();
                    break;
                case 3:
                    break outer;
            }
        }


    }
}
