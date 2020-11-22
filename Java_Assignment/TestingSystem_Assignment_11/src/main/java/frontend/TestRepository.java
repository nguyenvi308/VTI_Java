package frontend;

import backend.businesslayer.AccountService;
import datalayer.AccountRepository;
import backend.entity.Account;
import backend.presentationlayer.AccountController;
import utils.JDBCUtils;


import java.sql.Connection;
import java.util.List;


public class TestRepository {

    public static void main(String[] args) throws Exception {

        JDBCUtils jdbcUtils = JDBCUtils.getInstance();
        Connection conn = jdbcUtils.connect();


        AccountController accountController = new AccountController(new AccountService(new AccountRepository(conn)));

        // Get list account
        List<Account> accounts = accountController.getListAccounts();
        accounts.forEach(System.out::println);
        // Find By ID
        Account account = accountController.findAccountByID(2);
        // Find By Name
        List<Account> accounts1 = accountController.findAccountByFullName("Nguyen Hoang");
        accounts1.forEach(System.out::println);
        

    }
}
