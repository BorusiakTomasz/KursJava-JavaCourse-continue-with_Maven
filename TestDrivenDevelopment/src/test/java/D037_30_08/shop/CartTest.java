package D037_30_08.shop;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Miver on 2017-09-03.
 */
public class CartTest {
    private Cart cart;
    private ProductRepository productRepository;

    @Before
    public void initialize() {
        productRepository = mock(ProductRepository.class);
        cart = new Cart();

        Product laptop = new Product(1, "laptop", 3000);
        Product telefon = new Product(2, "telefon", 1000);
        Product telewizor = new Product(3, "telewizor", 1500);

        when(productRepository.getAllProducts()).thenReturn(Arrays.asList(laptop, telefon, telewizor));
    }

    @Test
    public void sumPrice() throws Exception {
        cart.addProducts(productRepository.getAllProducts());

        assertEquals(5500, cart.sumPrice(), 0);
    }

    @Test
    public void addDiscount() throws Exception {
        cart.addProducts(productRepository.getAllProducts());
        cart.addDiscount(20);

        assertEquals(4400, cart.sumPrice(), 0);
    }
}