package java_study.day08;

import java.util.List;

public class Product {

    private String name;
    private Category category;
    private double price;

    public Product(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public static int countByCategory(List<Product> products, Category category) {
        if (products == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        int count = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                count++;
            }
        }
        return count;
    }

    public static double averagePrice(List<Product> products, Category category) {
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int count = countByCategory(products, category);
        if (count == 0) {
            throw new IllegalArgumentException("No products in category: " + category);
        }
        double sum = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                sum += product.getPrice();
            }
        }
        return sum / count;
    }

    public static Product mostExpensive(List<Product> products, Category category) {
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        Product result = null;
        for (Product product : products) {
            if (product.getCategory() == category && (result == null ||product.getPrice() > result.getPrice())) {
                result = product;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("No products in category: " + category);
        }
        return result;
    }


    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + category + " " + price;
    }
}
