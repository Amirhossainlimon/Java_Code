abstract class Payment {
    abstract void processPayment(double amount);
}

class CashPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Cash payment of " + amount + " processed.");
    }
}

class OnlinePayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Online payment of " + amount + " processed.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p;

        p = new CashPayment();
        p.processPayment(500);

        p = new OnlinePayment();
        p.processPayment(1200);
    }
}
