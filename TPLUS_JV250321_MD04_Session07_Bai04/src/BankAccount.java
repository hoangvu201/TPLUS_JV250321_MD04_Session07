public class BankAccount implements IBank {
    private String accountId;
    private double balance;
    private String userName;
    private String phoneNumber;

    public BankAccount() {
    }

    public BankAccount(String accountId, String userName, String phoneNumber, double initialBalance) {
        this.accountId = accountId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.balance = initialBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Đã nhận tiền: " + amount);
        } else {
            System.out.println("Số tiền nạp không hợp lệ!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Đã rút " + amount);
        } else {
            System.out.println("Số dư không đủ hoặc số tiền không hợp lệ.");
        }
    }

    public void displayBalance() {
        System.out.println("Mã tài khoản: " + accountId);
        System.out.println("Tên người dùng: " + userName);
        System.out.println("Số dư: " + balance + " VND");
    }

}
