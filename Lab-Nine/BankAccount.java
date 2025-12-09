class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Mintaj Miul Ahad Atif");
        acc.setAccountNumber("251018");
        acc.setBalance(5000.00);

        System.out.println("Bank Account Information:");
        acc.showAccountInfo();
    }
}
