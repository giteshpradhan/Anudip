public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 123456, 4500);
        acc.deposit(1000);
        acc.withdraw(200);

        int currentBalance = acc.getBalance();
        String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("Balance: " + currentBalance);
        System.out.println("Status: " + status);
    }
}
