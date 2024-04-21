package task04;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 150.0, true, LocalDateTime.of(2024, 4, 16, 11, 15)));
        products.add(new Product("Book", 300.0, false, LocalDateTime.of(2024, 4, 16, 14, 30)));
        products.add(new Product("Cup", 270.00, true, LocalDateTime.of(2024, 4, 16, 2, 22)));
        products.add(new Product("Glass", 300.00, true, LocalDateTime.of(2024, 4, 16, 21, 43)));
        products.add(new Product("Book", 470.00, true, LocalDateTime.of(2024, 4, 16, 18, 53)));

        List<Product> lastThreeAddedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Last three added products: ");
        for (Product product : lastThreeAddedProducts) {
            System.out.println(product.getType() + " - " + product.getPrice() + " - " + product.getCreateDate());
        }
    }
}
