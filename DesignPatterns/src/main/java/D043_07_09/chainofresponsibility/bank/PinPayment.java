package D043_07_09.chainofresponsibility.bank;

import java.util.Scanner;

/**
 * Created by Miver on 2017-09-08.
 */
public class PinPayment extends Payment {
    private final Double MAX_AMOUNT = 500D;

    protected PinPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_AMOUNT;
    }

    @Override
    protected boolean handlePayment(Double amount) {
        System.out.println("Handling payment with pin...");
        int pinFromUser = 1234;
        return account.pay(amount, pinFromUser);
    }
}
