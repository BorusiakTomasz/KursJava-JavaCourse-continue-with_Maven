package D037_30_08.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miver on 2017-08-30.
 */
public class Cart {
    private List<Product> product = new ArrayList<Product>();

    public void addProduct(Product p) {
        product.add(p);
    }

    public void addProducts(List<Product> pl) {
        product.addAll(pl);
    }

    public void deleteProduct(Product p) {
        product.remove(p);
    }

    public double sumPrice() {
        double price = 0;

        for (Product aProduct : product)
            price += aProduct.getPrice();

        return price;
    }

    public void addDiscount(int percent) {
        for (Product aProduct : product)
            aProduct.setPrice(aProduct.getPrice() * (100 - percent)/100);

//        aProduct.setPrice(aProduct.getPrice() - (aProduct.getPrice() * percent / 100));
//        product.forEach(p -> p.setPrice(p.getPrice() * (100 - percent)/100));
    }

    public int getCartSize() {
        return product.size();
    }
}
