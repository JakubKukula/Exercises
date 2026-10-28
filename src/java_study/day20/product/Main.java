package java_study.day20.product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Mleko", 4.0, "FOOD", true));
        products.add(new Product("Ser", 4.0, "FOOD", true));
        products.add(new Product("Masło", 3.5, "FOOD", false));
        products.add(new Product("Mydło", 6.0, "HOME", true));

        System.out.println(Product.cheapestAvailable(products, "FOOD"));    // Masło
        /*
        iteracja    warunek                             result
        1           catrgoria true && null true         Mleko
        2           true && false                       Mleko
        3           true && true                        Mydło
        4           false                               Mydło
        koniec petli
         */
        System.out.println(Product.cheapestAvailable(products, "HOME"));    // Mydło
        System.out.println(Product.cheapestAvailable(products, "TOYS"));    // null
        System.out.println(Product.averagePrice(products));                 // 4.375
        System.out.println(Product.averagePrice(new ArrayList<>()));        // 0.0
        System.out.println(Product.countAbove(products, 4.0));              // 1
        System.out.println(Product.countAbove(products, 3.0));              // 4

    }
}
