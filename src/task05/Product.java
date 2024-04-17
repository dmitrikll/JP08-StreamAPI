package task05;

import java.time.LocalDate;

public class Product {
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDate createDate;

    public Product(String type, double price, boolean discountApplicable, LocalDate createDate) {
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
        this.createDate = createDate;
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

    public LocalDate getCreateDate() {
        return createDate;
    }
}
