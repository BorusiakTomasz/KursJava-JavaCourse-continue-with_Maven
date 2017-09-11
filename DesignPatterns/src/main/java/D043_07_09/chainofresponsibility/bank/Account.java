package D043_07_09.chainofresponsibility.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.regex.Pattern;

/**
 * Created by Miver on 2017-09-08.
 */
@RequiredArgsConstructor
public class Account {
    public static final int PIN_LENGTH = 4;
    @Getter
    private Double balance = 0D;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String owerName;

    private final int pin;
    private final int token;
    Pattern p = Pattern.compile("^\\d{4}$");


    public Account(Double balance, int pin, int token) {
        this.balance = balance;
        this.pin = pin;
        this.token = token;
    }

    public boolean pay(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean pay(Double amount, int pin) {
        if (validate(pin)) {
            return pay(amount);
        }
        return false;
    }

    public boolean pay(Double amount, int pin, int token) {
        if (Integer.toString(token).length() == 6) {
            return pay(amount, pin);
        }
        return false;
    }

    public boolean validate(int pin) {
        return Integer.toString(pin).matches(p.pattern());
//        if (Integer.toString(pin).length() == PIN_LENGTH) {
//            return this.pin == pin;
//        }
    }
}
