package java_study.day02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("123456");

        System.out.println(account);

        final int[] t = {1, 2};
        t[0] = 10;
        System.out.println(Arrays.toString(t));

        //t = new int[3];


        Product p1 = new Product("Milk",10.0);
        Product p2 = new Product("Bread",5.0);
        final Product p = new Product("Ball",12.5);
        p.setPrice(22);
        //p = new Product("Butter",8.0);
        //java: cannot assign a value to final variable p



        System.out.println(p1.priceWithVat());
        System.out.println(p2.priceWithVat());
        System.out.println(Product.getCount());

        p1.setPrice(20);

        System.out.println(p1.priceWithVat());

//        int x;
//        System.out.println(x);
//        java: variable x might not have been initialized



    }
}
