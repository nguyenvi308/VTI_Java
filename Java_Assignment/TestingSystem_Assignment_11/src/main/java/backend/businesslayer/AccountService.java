package backend.businesslayer;

import datalayer.AccountRepository;
import backend.entity.Account;
import java.sql.SQLException;
import java.util.List;



public class AccountService   {


    AccountRepository accountRepository ;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getListAccount() throws SQLException {
        List<Account> accounts  = accountRepository.getList();
        return accounts;
    }

    public Account findAccountByID(int id) throws Exception {
        Account account = accountRepository.getById(id);
        return account;
    }
    public Account findAccountByUserName(String userName) throws Exception {
        return accountRepository.getByUserName(userName);
    }
    public List<Account> findAccountByFullName(String fullName) throws Exception {
        return accountRepository.getByFullName(fullName);
    }

    public Boolean isExistingAccount(int id) throws SQLException {
        return accountRepository.isExists(id);
    }

    // May be name or user name
    public Boolean isExistingAccount(String name) throws SQLException {
        return accountRepository.isExists(name);
    }

    public void  deleteAccountById(int id) throws SQLException {
       accountRepository.delete(id);

    }



}
