package task04;

import java.time.LocalDateTime;

public class Product {
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDateTime createDate;

    public Product(String type, double price, boolean discountApplicable, LocalDateTime createDate) {
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

    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
