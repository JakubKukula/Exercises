package java_study.day08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Chleb", Category.FOOD, 4.99));
        products.add(new Product("Mleko", Category.FOOD, 3.49));
        products.add(new Product("Ser żółty", Category.FOOD, 12.90));
        products.add(new Product("Laptop", Category.ELECTRONICS, 3499.00));
        products.add(new Product("Słuchawki", Category.ELECTRONICS, 249.99));
        products.add(new Product("Smartfon", Category.ELECTRONICS, 1899.00));
        products.add(new Product("Myszka", Category.ELECTRONICS, 89.90));
        products.add(new Product("Kurtka", Category.CLOTHES, 299.00));
        products.add(new Product("T-shirt", Category.CLOTHES, 39.99));
        products.add(new Product("Buty", Category.CLOTHES, 349.50));
        products.add(new Product("Czapka", null, 34.1));

        System.out.println(Product.countByCategory(products,null));

        System.out.println(Product.countByCategory(products,Category.FOOD));
        System.out.println(Product.countByCategory(products,Category.ELECTRONICS));
        System.out.println(Product.countByCategory(products,Category.CLOTHES));

        System.out.println(Product.averagePrice(products,Category.FOOD));

        System.out.println(Product.mostExpensive(products,Category.CLOTHES));

    }
}
