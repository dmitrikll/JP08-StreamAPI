package task05;

import java.time.LocalDate;

public class Product {
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDate dateAdded;

    public Product(String type, double price, boolean discountApplicable, LocalDate dateAdded) {
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

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}
