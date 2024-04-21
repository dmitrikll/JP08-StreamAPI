package task06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Book", 15.0, false, LocalDate.of(2024, 4, 1)));
        products.add(new Product(2, "Book", 30.0, true, LocalDate.of(2023, 2, 2)));
        products.add(new Product(3, "Cup", 270.0, true, LocalDate.of(2022, 11, 11)));
        products.add(new Product(4, "Glass", 300.0, true, LocalDate.of(2024, 3, 1)));
        products.add(new Product(5, "Book", 47.0, true, LocalDate.of(2024, 1, 31)));

        Map<String, List<Product>> productsByType = products.stream().collect(Collectors.groupingBy(Product::getType));

        productsByType.forEach((type, productList) -> {
            System.out.println(type + ": ");
            productList.forEach(product -> System.out.println(" " + product));
        });
    }
}
