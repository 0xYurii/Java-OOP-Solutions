package lap_04.task02;

public class BankAccount {

    String owner;
    double balance;
    TransactionLog log;

    public BankAccount(String owner, double balance, int capacity) {
        this.owner = owner;
        this.balance = balance;
        this.log = new TransactionLog(capacity);
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            log.add(new Transaction("Deposit", amount, balance));
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            log.add(new Transaction("Withdraw", amount, balance));
            return true;
        }
        return false;
    }

    public void printState() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
        for (int i = 0; i < log.count(); i++) {
            System.out.println(log.get(i).toLine());
        }
    }
}
