package bai2;

public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }
    @Override
    void pay() {
        printAmount();
        System.out.println("Paid in cash.");
    }
}
