package task02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 150.0, true));
        products.add(new Product("Book", 300.0, false));
        products.add(new Product("Cup", 270.0, true));
        products.add(new Product("Glass", 300.0, false));
        products.add(new Product("Book", 470.0, true));


        List<Product> discountedProducts = getDiscountedProducts(products);
        discountedProducts.forEach(product -> System.out.println("Final price for " +
                product.getType() + ": USD " + product.getPrice()));
    }

    public static List<Product> getDiscountedProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.isDiscountApplicable())
                .map(product -> {
                    double discountedPrice = applyDiscount(product.getPrice());
                    product.setPrice(discountedPrice);
                    return product;
                })
                .collect(Collectors.toList());
    }

    public static double applyDiscount(double price) {
        return price - (price * 10 / 100);
    }

}