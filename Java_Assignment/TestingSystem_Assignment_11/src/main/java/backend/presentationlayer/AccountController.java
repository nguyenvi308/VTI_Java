package backend.presentationlayer;

import backend.businesslayer.AccountService;
import backend.entity.Account;

import java.sql.SQLException;
import java.util.List;

public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public List<Account> getListAccounts() throws SQLException {
        List<Account> accounts = accountService.getListAccount();
        return accounts;

    }

    public Account findAccountByID(int id) throws Exception {
        Account account  = accountService.findAccountByID(id);
        return account;
    }


    public Account findAccountByUserName(String userName) throws Exception {
        Account account = accountService.findAccountByUserName(userName);
        return account;
    }
    public List<Account> findAccountByFullName(String fullName) throws Exception {
        List<Account> accounts = accountService.findAccountByFullName(fullName);
        return accounts;
    }


    public void deleteByID(int id) throws SQLException {
         accountService.deleteAccountById(id);
    }


}
