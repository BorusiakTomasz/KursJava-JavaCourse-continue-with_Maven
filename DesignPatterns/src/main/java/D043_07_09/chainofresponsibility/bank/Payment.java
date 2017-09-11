package D043_07_09.chainofresponsibility.bank;

/**
 * Created by Miver on 2017-09-08.
 */
public abstract class Payment {
    protected final Account account;
    protected Payment nextPayment;

    protected Payment(Account account) {
        this.account = account;
    }

    protected abstract Double getMaxAmount();

    protected abstract boolean handlePayment(Double amount);

    public void setNextPayment(Payment nextPayment) {
        this.nextPayment = nextPayment;
    }

    public boolean processPayment(Double amount) {
        if (amount < getMaxAmount())
            return this.handlePayment(amount);
        else if (nextPayment != null)
            return nextPayment.processPayment(amount);
        return false;
    }
}
