package D043_07_09.chainofresponsibility.bank;

/**
 * Created by Miver on 2017-09-08.
 */
public class PayPassPayment extends Payment {
    private final Double MAX_AMOUNT = 50D;

    public PayPassPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_AMOUNT;
    }

    @Override
    protected boolean handlePayment(Double amount) {
        System.out.println("Handling payment without pin...");
        return account.pay(amount);
    }
}
