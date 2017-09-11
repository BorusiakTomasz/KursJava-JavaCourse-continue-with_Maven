package D043_07_09.chainofresponsibility.bank;

import java.util.Scanner;

/**
 * Created by Miver on 2017-09-08.
 */
public class TwoFactorPayment extends Payment {
private final Double MAX_AMOUNT = 5000D;

    protected TwoFactorPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_AMOUNT;
    }

    @Override
    protected boolean handlePayment(Double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your pin: ");
        int pin = sc.nextInt();
        if (account.validate(pin)) {
            System.out.println("Your verification token");
            int token = sc.nextInt();
            return account.pay(amount, pin, token);
        }
        return false;
    }
}
