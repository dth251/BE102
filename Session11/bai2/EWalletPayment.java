package bai2;

public class EWalletPayment extends Payment implements Refundable{

    public EWalletPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        printAmount();
        System.out.println("Paid with e-wallet.");
    }

    @Override
    public void refund() {
        System.out.println("Refunded to e-wallet.");
    }
}
