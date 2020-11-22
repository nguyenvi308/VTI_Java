package com.nguyenvi.TestingSystem_Assignment_2;

import com.nguyenvi.TestingSystem_Assignment_1.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercise5 {
    /*
    Question 1:
Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
*/
    public  static  final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       question9();

    }
    public static void question1()
    {

        int[] arr = new int[3];
        for (int i = 0; i < 3 ; i++)
        {
            System.out.println("Enter Number " + i + " ");
            arr[i] = scanner.nextInt();

        }
        for (int a : arr)
        {
            System.out.println(a);
        }
    }
    public static void question2()
    {

       double a,b;

        System.out.println("Enter the first number : " );
        a = scanner.nextDouble();

        System.out.println("Enter the second number : " );
        b = scanner.nextDouble();



    }
    public static void question3()
    {

        String firstName,lastName;

        System.out.println("Enter  first name : " );
        firstName = scanner.nextLine();
        System.out.println("Enter the last name : " );
        lastName = scanner.nextLine();



    }
    public static void question4()
    {

        String srtDate;
        System.out.println("Enter your date of birth : ");
        srtDate = scanner.nextLine();
        Date date = null;
        try {
             date = new SimpleDateFormat("dd/MM/yyyy").parse(srtDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);


    }
    public static  Position positionList(int id)
    {
        List<Position> positions = new ArrayList<>();
        Position dev = new Position();
        dev.setPositionID(1);
        dev.setPositionName("Dev");
        Position test = new Position();
        test.setPositionID(2);
        test.setPositionName("Dev");
        Position scrumMaster = new Position();
        scrumMaster.setPositionID(3);
        scrumMaster.setPositionName("Scrum Master");
        Position pm = new Position();
        pm.setPositionID(4);
        pm.setPositionName("PM");

        positions.add(dev);
        positions.add(test);
        positions.add(scrumMaster);
        positions.add(pm);

        Position matchPosition = null ;
        for (Position position : positions)
        {
            if (id == position.getPositionID())
            {
                matchPosition = position;
            }
        }
        return matchPosition;


    }
    public  static void question5()
    {
        Account account = new Account();
        System.out.println("Enter ID ");
        account.setAccountID(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Name :");
        account.setFullName(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter Email: ");
        account.setEmail(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter Position: ");
        account.setPositionID(positionList(scanner.nextInt()));

        System.out.println(account);
    }
    public static Department question6()
    {
        Department department = new Department();
        System.out.println("Enter ID of Department : ");
        department.setDepartmentID(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Name of Department :");
        department.setDepartmentName(scanner.nextLine());
        System.out.println(department);
        return  department;
    }

    public static  void question7()
    {
        int c ;
        do {
            System.out.println("Enter Number: ");
            c = scanner.nextInt();
            if (c%2 == 0)
            {
                break;
            }

        }while (true);
        System.out.println(c);
    }

    public static void question8()
    {
        int number;
        boolean isContinue = true;
        System.out.println("Enter a number to select function: ");
        do {

            number = scanner.nextInt();
           switch (number){
               case 1:
                   question5();
                   isContinue = false;
                   break;
               case 2:
                   question6();
                   isContinue = false;
                   break;
               default:
                   System.out.println("Please enter correct number : ");

           }
        }while (isContinue);

    }
    /*

Question 9:
Viết method cho phép người dùng thêm group vào account theo flow sau:
Bước 1:
In ra tên các usernames của user cho người dùng xem
Bước 2:
Yêu cầu người dùng nhập vào username của account
Bước 3:
In ra tên các group cho người dùng xem
Bước 4:
Yêu cầu người dùng nhập vào tên của group
Bước 5:
Dựa vào username và tên của group người dùng vừa chọn, hãy
thêm account vào group đó .
*/



    public static List<Account> userList()
    {
        // May get data of users from database
        Account vi = new Account();
        vi.setAccountID(1);
        vi.setUserName("vi.nguyen");
        Account maiAnh = new Account();
        maiAnh.setAccountID(2);
        maiAnh.setUserName("anh.le");

        Account tu = new Account();
        tu.setAccountID(3);
        tu.setUserName("tu.nguyen");
        Account hanh = new Account();
        hanh.setAccountID(4);
        hanh.setUserName("hanh.tran");

        List<Account> accounts = new ArrayList<>();
        accounts.add(vi);
        accounts.add(maiAnh);
        accounts.add(tu);
        accounts.add(hanh);
        return accounts;
    }

    // Create a group of list
    public static List<Group> groupList() {
        List<Group> groups = new ArrayList<>();
        Group group1 = new Group();
        group1.setGroupID(1);
        group1.setGroupName("Group 1");

        Group group2 = new Group();
        group2.setGroupID(2);
        group2.setGroupName("Group 2");


        Group group3 = new Group();
        group3.setGroupID(3);
        group3.setGroupName("Group 3");

        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        return groups;
    }




    // List of group account
    // Table group account : group id , account id;
    public static List<GroupAccount> groupAccountList()
    {
        List<GroupAccount> groupAccounts = new ArrayList<>();

        GroupAccount groupAccount1 = new GroupAccount();

        GroupAccount groupAccount2 = new GroupAccount();


        groupAccount1.setGroupID(groupList().get(0));
        groupAccount1.setAccount(userList());

        groupAccount2.setGroupID(groupList().get(1));
        List<Account> accounts = new ArrayList<>();
        accounts.add(userList().get(2));
        accounts.add(userList().get(3));
        groupAccount2.setAccount(accounts);


        groupAccounts.add(groupAccount1);
        groupAccounts.add(groupAccount2);


        return groupAccounts;

    }
    public static void showAllUserName(List<Account> accounts)
    {
        for (int i = 0 ; i< accounts.size() ; i++)
        {
            System.out.println(accounts.get(i).getUserName());
        }
    }
    public  static void showAllGroups(List<Group> groups)
    {
        for (int i = 0 ; i< groups.size() ; i++)
        {
            System.out.println(groups.get(i).getGroupName());
        }
    }
    public static void question9()
    {
        /*
         - Show all user list
         - Show all group list
         - Add user
           Enter name
            Check if user is exists
                   TRUE
                   {
                     -> Check if user was in a group
                            TRUE
                                return
                             FALSE
                                enter group name and check if group is created:
                                    TRUE :
                                        - Add this user to this group
                                    FALSE :
                                        - Create a new once
                                        - then add user to
                   }
                    FALSE
                    {
                        -> create a new once
                        -> add to group account not need to check
                    }
         */
        showAllUserName(userList());
        showAllGroups(groupList());
        System.out.println("Enter user name ");
        String userName = scanner.nextLine();
        scanner.nextLine();
        if (checkIfAccountExisted(userName , groupAccountList()))
        {
            System.out.println("Account has been already existed");
        }else {

            System.out.println("Account is new !");
            System.out.println("Enter Group Name ");
            String groupName = scanner.nextLine();
            if (checkIfGroupExisted(groupName, groupAccountList())) {
                // add user to this group
                Account account = new Account();
                account.setUserName(userName);
                addToGroup(account, groupName, groupAccountList());

            } else {
                // Add to new  group
                addToNewGroup(userName, groupName, groupAccountList());


            }
        }
    }

    // Add to existed group
    private static void addToGroup(Account account, String groupName , List<GroupAccount> groupAccounts) {
        // Get  group that has name

        outer: for (int i = 0 ; i < groupAccounts.size(); i ++)
        {

           GroupAccount groupAccount = groupAccounts.get(i);
           if (groupAccount.getGroupID().getGroupName().equals(groupName))
           {
               groupAccount.getAccount().add(account);
               break outer;
           }

        }

        userList().add(account);
        System.out.println("Updated Accounts :");
        System.out.println(userList());
        System.out.println("Add Successfully ! ");

    }
    private static void addToNewGroup(String userName , String groupName , List<GroupAccount> groupAccounts)
    {

        System.out.println("Create a new Group ");
        Account account = new Account();
        account.setUserName(userName);
        Group group = new Group();
        group.setGroupName(groupName);

        GroupAccount groupAccount = new GroupAccount();
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        groupAccount.setGroupID(group);
        groupAccount.setAccount(accounts);

        List<Group> updatedGroup = new ArrayList<>();
        updatedGroup.addAll(groupList());
        updatedGroup.add(group);

        System.out.println(updatedGroup);
        System.out.println("Add Successfully ! ");
    }

    private static boolean checkIfGroupExisted(String groupName, List<GroupAccount> groupAccounts) {
        boolean answer = false;
        outer: for (int i = 0 ; i < groupAccounts.size(); i ++)
        {

            GroupAccount groupAccount = groupAccounts.get(i);
            Group group = groupAccount.getGroupID();

            if (group.getGroupName().equals(groupName))
            {
                answer = true;
                break outer;
            }
        }

        return answer;
    }


    // Check if user is in account list
    // if -> getThat user 
    // if not -> create a new user with a user name is provided 
    public  static boolean checkIfAccountExisted(String userName , List<GroupAccount> groupAccounts)
    {
        boolean answer = false;
        outer: for (int i = 0 ; i < groupAccounts.size(); i ++)
        {

            List<Account> listAccountInThisGroup = groupAccounts.get(i).getAccount();
            for (int j = 0 ; j < listAccountInThisGroup.size(); j ++)
            {
                Account accountInThisGroup = listAccountInThisGroup.get(j);
                if (userName.equals(accountInThisGroup.getUserName()))
                {
                    answer =  true;
                    break ;
                }
            }
        }

        return answer;

    }
    

    


    






    /*
Question 10: Tiếp tục Question 8 và Question 9
Bổ sung thêm vào bước 2 của Question 8 như sau:
Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
account
Bổ sung thêm Bước 3 của Question 8 như sau:
Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
kết thúc chương trình)
Question 11: Tiếp tục Question 10
Bổ sung thêm vào bước 2 của Question 8 như sau:
Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
Bước 1:
In ra tên các usernames của user cho người dùng xem

6

Bước 2:
Yêu cầu người dùng nhập vào username của account
Bước 3:
Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
Bước 4:
Thêm account vào group chương trình vừa chọn ngẫu
nhiên
     */
}
