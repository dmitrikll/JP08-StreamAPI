package task06;

import java.time.LocalDate;

public class Product {
    private int id;
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDate createDate;

    public Product(int id, String type, double price, boolean discountApplicable, LocalDate createDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discountApplicable=" + discountApplicable +
                ", createDate=" + createDate +
                '}';
    }
}
