interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

class DBBL implements ATMService {
    private double balance;

    public DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful: $" + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class ATMTest {
    public static void main(String[] args) {
        DBBL myAccount = new DBBL(1000.0);

        myAccount.checkBalance();
        myAccount.deposit(500.0);
        myAccount.withdraw(300.0);
        myAccount.checkBalance();
    }
}
