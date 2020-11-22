package com.nguyenvi.TestingSystem_Assignment_2;

import com.nguyenvi.TestingSystem_Assignment_1.entities.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {

        Department sale = new Department();
        sale.setDepartmentID(1);
        sale.setDepartmentName("Sale");

        Department finance = new Department();
        finance.setDepartmentID(1);
        finance.setDepartmentName("Finance");


        // Create Account
        Account account = new Account();
        account.setAccountID(1);

        Account account1 = new Account();
        account1.setAccountID(2);
        account1.setDepartmentID(finance);


        Group group1 = new Group();
        group1.setGroupID(1);
        group1.setGroupName("Group 1");

        Group group2 = new Group();
        group2.setGroupID(2);
        group2.setGroupName("Group 2");



        // Create group account 1
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.setGroupID(group1);
        // List of Accounts 1
        List<Account> accountsInGroup1 = new ArrayList<>();
        accountsInGroup1.add(account);
        accountsInGroup1.add(account1);

        groupAccount1.setAccount(accountsInGroup1);


        // Create group account 2
        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.setGroupID(group2);
        // List of Accounts 2
        List<Account> accountsInGroup2 = new ArrayList<>();
        accountsInGroup2.add(account);

        groupAccount2.setAccount(accountsInGroup2);


        //question1(account);




        List<GroupAccount> groupAccounts = new ArrayList<>();
        groupAccounts.add(groupAccount1);
        groupAccounts.add(groupAccount2);
        //question2(forQuestion2(groupAccounts, account));

        // Question 4
        Position dev = new Position();
        dev.setPositionID(1);
        dev.setPositionName("Dev");
        Account account2 = new Account();
        account2.setPositionID(dev);

        // question4(account2);

        // Question 5


//        question5(groupAccount2);
//        question5(groupAccount1);
//
//        // Question 6
//        System.out.println("Question 6");
//        question6(3);
//        // Question 7
//        System.out.println("Question 7");
//        question7(account1);
        // Question 8
        question8(accountsInGroup1);
        question8(accountsInGroup2);
        // Question 9
        // Question 10
        System.out.println("Question 1o: ");
        question10(accountsInGroup1);

        // Question 15
        question15();
        // Question 17
        question17_1(accountsInGroup1);






    }
    public static void question1(Account account)
    {
        if (account.getDepartmentID() == null)
        {
            System.out.println("Nhân viên này chưa có phòng ban");
        }else
        {
            System.out.println("Phòng ban của nhân viên này là " + account.getDepartmentID().getDepartmentName());
        }
    }

    public static int forQuestion2(List<GroupAccount> groupAccountList, Account account) {
        // In groupAccountList has list of groupAccounts
        // And each groupAccount has list of accounts

        System.out.println("Account : " + account.getAccountID());
        int temp = 0;
        for (int i = 0; i < groupAccountList.size(); i++) {
            for (int j = 0; j < groupAccountList.get(i).getAccount().size(); j++) {
                if (groupAccountList.get(i).getAccount().get(j).getAccountID() == account.getAccountID()) {
                    temp++;

                }
            }
        }
        return temp;
    }
    public static void question2(int temp)
    {
        if (temp == 0 )
        {
            System.out.println("Nhân viên này chưa có group");

        }else if (temp == 1 || temp == 2)
        {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        }else if (temp == 3 )
        {
            System.out.println("hân viên này là người quan trọng, tham gia nhiều group");
        }else
        {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

    }
    public static void question3(int temp)
    {
        String answer = (temp == 0 )? "Nhân viên này chưa có group" :
                (
                        (
                                (temp == 1) || (temp ==2) ? "Group của nhân viên này là Java Fresher, C# Fresher" :
                                        (temp == 3 ) ? "hân viên này là ngườ quan trọng, tham gia nhiều group ":
                                                "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
                        )
                );
        System.out.println(answer);
    }
    public static void question4(Account account)
    {
        String answer = (account.getPositionID().getPositionName().equals("Dev"))? "Đây là Developer" : "Người này không phải là Developer";
        System.out.println(answer);

    }
    public  static void question5(GroupAccount groupAccount)
    {

        switch (groupAccount.getAccount().size()) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default: System.out.println("Nhóm có nhiều thành viên");
        }

    }
    public static  void question6(int temp)
    {

        if (temp < 0)
        {
            return;
        }
        switch (temp){
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1,2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("hân viên này là người quan trọng, tham gia nhiều group ");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;

        }
    }
    public static  void question7(Account account)
    {
        if (account.getDepartmentID() == null)
        {
            return;
        }else
        {
            switch(account.getDepartmentID().getDepartmentName())
            {
                case "Dev":
                    System.out.println("Đây là Developer");
                    break;
                default:
                    System.out.println("Người này không phải là Developer");

            }
        }
    }


    public  static void question8(List<Account> accounts)
    {
        for (Account account: accounts)
        {
            System.out.println(account);
        }
    }
    public  static void question9(List<Department> departments)
    {
        for (Department department: departments)
        {
            System.out.println(department);
        }
    }

    public  static  void forQuestion10(Account account)
    {
        System.out.println("Email " + account.getEmail());
        System.out.println("FullName " + account.getFullName());
        System.out.println("Department " + ((account.getDepartmentID() == null) ? "No Department" : account.getDepartmentID().getDepartmentName()));

    }
    // For Loop
    public  static void question10(List<Account> accounts)
    {
        for (int i = 0; i < accounts.size(); i++)
        {
            Account account = accounts.get(i);
            forQuestion10(account);
        }
    }


    private static void forQuestion11(Department department) {
        System.out.println("Id: " + department.getDepartmentID() );
        System.out.println("Name : " + department.getDepartmentName());
    }
    public  static void question11(List<Department> departments)
    {
        for (int i = 0; i < departments.size(); i++)
        {
            Department department = departments.get(i);
            forQuestion11(department);
        }
    }
    public  static void question12(List<Account> accounts)
    {

        Collections.sort(accounts, (account1 , account2) -> Integer.valueOf(account1.getAccountID()).compareTo(account2.getAccountID()));
        for (int i = 0; i < 2; i++)
        {
            Account account = accounts.get(i);
            forQuestion10(account);
        }
    }
    public  static void question13(List<Account> accounts)
    {

        Collections.sort(accounts, (account1 , account2) -> Integer.valueOf(account1.getAccountID()).compareTo(account2.getAccountID()));
        for (int i = 0; i < accounts.size(); i++)
        {

            Account account = accounts.get(i);
           if (account.getAccountID() == 2)
           {
               continue;
           }else {
               forQuestion10(account);
           }
        }
    }
    public  static void question14(List<Account> accounts)
    {

        for (int i = 0; i < accounts.size(); i++)
        {

            Account account = accounts.get(i);
            if (account.getAccountID() < 4)
            {
                continue;
            }else {
                forQuestion10(account);
            }
        }
    }

    public static void question15()
    {
        for (int i = 0 ; i <= 20 ; i++)
        {
            if (i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }

    // While
    public static void question16_1(List<Account> accounts)
    {
        int i = 0 ;
        while (i < accounts.size())
        {
            Account account = accounts.get(i);
            forQuestion10(account);
            i++;
        }
    }
    public static void question16_2(List<Department> departments)
    {
        int i = 0 ;
        while (i < departments.size())
        {
           Department department = departments.get(i);
            forQuestion11(department);
            i++;
        }
    }
    public  static void question16_3(List<Account> accounts)
    {
        int i = 0;
        while (i < accounts.size())
        {
            Account account = accounts.get(i);
            if (account.getAccountID() == 2)
            {
                continue;
            }else
            {
                forQuestion10(account);
            }
        }
    }
    // Do While
    public  static void question17_1(List<Account> accounts)
    {
        int i = 0;
        do {
            Account account =  accounts.get(i);
            forQuestion10(account);
            i ++;
        }while (i < accounts.size());
    }
    public static void question17_2(List<Department> departments)
    {
        int i = 0 ;
        do {
            Department department = departments.get(i);
            forQuestion11(department);
            i++;
        }while (i < departments.size());
    }
    public  static void question17_3(List<Account> accounts)
    {
        int i = 0;
        do {
            Account account = accounts.get(i);
            if (account.getAccountID() == 2)
            {
                continue;
            }else
            {
                forQuestion10(account);
            }
        }while (i < accounts.size());
    }



}
