package bank;

public class InvalidDebit extends Exception {
    public InvalidDebit() {
        super("Please enter a valid debit amount. Insufficient balance!");
    }
}
