package task03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 150.0, true));
        products.add(new Product("Book", 300.0, false));
        products.add(new Product("Cup", 270.0, true));
        products.add(new Product("Glass", 300.0, false));
        products.add(new Product("Book", 470.0, true));

        Optional<Product> cheapestProduct = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparingDouble(Product::getPrice));

        if (cheapestProduct.isPresent()) {
            System.out.println("The cheapest price: USD " + cheapestProduct.get().getPrice());
        } else {
            System.out.println("Product not found");
        }

    }
}
