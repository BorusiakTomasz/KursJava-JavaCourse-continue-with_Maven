package D043_07_09.chainofresponsibility.bank;

/**
 * Created by Miver on 2017-09-11.
 */
public class Program {
    public static void main(String[] args) {
        Account account = new Account(8000D, 1234, 123456);

        Payment payPassPayment = new PayPassPayment(account);
        Payment pinPayment = new PayPassPayment(account);
        Payment twoFactorPayment = new TwoFactorPayment(account);

        payPassPayment.setNextPayment(pinPayment);
        pinPayment.setNextPayment(twoFactorPayment);

        boolean b = payPassPayment.processPayment(3000D);
        System.out.println(b);
    }
}
