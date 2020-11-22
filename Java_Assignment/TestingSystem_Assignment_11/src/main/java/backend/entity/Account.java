package backend.entity;

/*
AccountID int AI PK
Email varchar(30)
username varchar(30)
FullName varchar(45)
DepartmentID int
PositionID int
CreateDate date
 */
public class Account {

    private int accountId;
    private String email;
    private String userName;
    private String fullName;

    public Account(int accountId, String email, String userName, String fullName) {
        this.accountId = accountId;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return accountId + "  " + email  + "  " + userName + "  " + fullName;
    }
}
