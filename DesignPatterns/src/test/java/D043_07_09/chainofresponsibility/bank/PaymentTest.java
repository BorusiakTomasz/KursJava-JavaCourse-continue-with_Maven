package D043_07_09.chainofresponsibility.bank;

import org.junit.Test;

/**
 * Created by Miver on 2017-09-08.
 */
public class PaymentTest {
    @Test
    public void test() {
        Account account = new Account(8000D, 1234, 12345);

        Payment payPassPayment = new PayPassPayment(account);
        Payment pinPayment = new PayPassPayment(account);
        Payment TwoFactorPayment = new TwoFactorPayment(account);

        payPassPayment.setNextPayment(pinPayment);
        pinPayment.setNextPayment(TwoFactorPayment);

        payPassPayment.processPayment(1000D);
    }

}