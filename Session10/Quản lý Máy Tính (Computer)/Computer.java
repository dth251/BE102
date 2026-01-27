package bai1;

public class Computer {

    public double calculatePrice(double baseprice) {
        return baseprice;
    }
    public double calculatePrice(double baseprice , double tax) {
        return baseprice + tax;
    }
    public double calculatePrice(double baseprice , double tax , double discount) {
        return baseprice + tax - discount;
    }
}
