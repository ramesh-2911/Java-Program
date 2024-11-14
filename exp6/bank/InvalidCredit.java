package bank;

public class InvalidCredit extends Exception {
    public InvalidCredit() {
        super("Please enter a valid credit amount.");
    }
}
