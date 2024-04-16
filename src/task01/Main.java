package task01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 150.00));
        products.add(new Product("Book", 300.00));
        products.add(new Product("Cup", 270.00));
        products.add(new Product("Glass", 300.00));
        products.add(new Product("Book", 470.00));

        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() > 250)
                .collect(Collectors.toList());

        System.out.println("List of products (type = Book, price > 250):");
        filteredProducts.forEach(product -> {
            System.out.println(product.getType() + " - " + product.getPrice());
        });
    }
}
