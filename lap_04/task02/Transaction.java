package lap_04.task02;

public class Transaction {

    String type;
    double amount;
    double balanceAfter;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    public String toLine() {
        String phrase = String.format(
            "Transaction type: %s, Amount: %.1f, Balance after: %.1f",
            type,
            amount,
            balanceAfter
        );

        return phrase;
    }
}
