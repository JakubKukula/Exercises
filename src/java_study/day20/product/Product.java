package java_study.day20.product;

import java.util.List;

public class Product {

    private String name;
    private double price;
    private String category;
    private boolean available;

    public Product(String name, double price, String category, boolean available) {
        //walidacje do każdego
        this.name = name;
        this.price = price;
        this.category = category;
        this.available = available;
    }

    public static Product cheapestAvailable(List<Product> products, String category) {
        Product result = null;
        for (Product product : products) {
            if (product.getCategory().equals(category) && product.available && (result == null || result.getPrice() > product.getPrice())) {
                result = product;
            }
        }
        return result;
    }

    public static double averagePrice(List<Product> products) {
        if (products == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        if (products.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum / products.size();
    }

    public static int countAbove(List<Product> products, double min) {
        int count = 0;
        for (Product product : products) {
            if (product.getPrice() > min) {
                count++;
            }
        }
        return count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return name;
    }

}
