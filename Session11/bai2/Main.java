package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new CashPayment(100.0));
        payments.add(new EWalletPayment(200.0));
        payments.add(new CreditCardPayment(500.0));

        for (Payment p: payments){
            p.pay();
            if(p instanceof Refundable){
                ((Refundable) p).refund();
            }
            System.out.println("-------------------");
        }
        
    }
}
