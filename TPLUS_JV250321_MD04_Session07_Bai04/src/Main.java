public class Main {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("A001", "Nguyễn Văn A", "0909123456", 1000);
        BankAccount accountB = new BankAccount("B001", "Trần Thị B", "0987654321", 200);
        double amount = 300;
        accountA.withdraw(amount);
        accountB.deposit(amount);

        accountA.displayBalance();
        accountB.displayBalance();
    }
}
