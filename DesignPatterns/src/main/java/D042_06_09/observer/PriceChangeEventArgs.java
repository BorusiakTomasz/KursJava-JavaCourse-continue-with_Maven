package D042_06_09.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Miver on 2017-09-06.
 */
@Getter
@Setter
@AllArgsConstructor
public class PriceChangeEventArgs {
    private double oldPrice;
    private double newPrice;
}
