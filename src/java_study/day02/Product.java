package java_study.day02;

public class Product {

    private final String name;
    private double price;
    private static int count;
    public static final double VAT = 0.23;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
    }

//    public void setName(String name){
//        this.name = name;
//    }
//    java: cannot assign a value to final variable name

    public double priceWithVat() {
        return price * (1 + VAT);
    }

    public static int getCount() {
        return count;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
