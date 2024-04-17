package task05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 15.0, true, LocalDate.of(2024, 4, 16)));
        products.add(new Product("Book", 30.0, true, LocalDate.of(2023, 2, 2)));
        products.add(new Product("Cup", 270.0, true, LocalDate.of(2022, 11, 11)));
        products.add(new Product("Book", 300.0, true, LocalDate.of(2024, 3, 1)));
        products.add(new Product("Book", 47.0, true, LocalDate.of(2024, 1, 31)));

        double totalCost = products.stream()
                .filter(product -> product.getDateAdded().getYear() == LocalDate.now().getYear())
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("Total cost of products: USD " + totalCost);
    }
}
