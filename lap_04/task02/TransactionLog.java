package lap_04.task02;

import java.util.ArrayList;

public class TransactionLog {

    int size;
    int capacity;
    ArrayList<Transaction> transactions;

    public TransactionLog(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.transactions = new ArrayList<Transaction>();
    }

    public boolean add(Transaction t) {
        if (transactions.size() != capacity) {
            transactions.add(t);
            size += 1;
            return true;
        }
        return false;
    }

    public Transaction get(int i) {
        return transactions.get(i);
    }

    public int count() {
        return transactions.size();
    }
}
