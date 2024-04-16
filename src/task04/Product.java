package task04;

import java.time.LocalDateTime;

public class Product {
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDateTime dateAdded;

    public Product(String type, double price, boolean discountApplicable, LocalDateTime dateAdded) {
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
        this.dateAdded = dateAdded;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountApplicable() {
        return discountApplicable;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }
}
