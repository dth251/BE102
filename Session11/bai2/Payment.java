package bai2;

public abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }


    abstract void pay();

    void printAmount() {
        System.out.println("Amount to be paid: " + amount);
    }
}
