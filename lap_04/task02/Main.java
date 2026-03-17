package lap_04.task02;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000.0, 20);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.deposit(150.0);
        account.withdraw(50.0);
        account.withdraw(100.0);
        account.deposit(300.0);
        account.withdraw(400.0);
        account.deposit(250.0);
        account.withdraw(150.0);
        account.deposit(100.0);

        System.out.println("--- Account Statement ---");
        account.printState();
    }
}
