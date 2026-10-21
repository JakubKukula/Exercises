package java_study;

public class Main {
    public static void main(String[] args) {

        StringBuilder x = new StringBuilder("hej");
        StringBuilder y = new StringBuilder("hej");
        System.out.println(x.equals(y));
        System.out.println(x.toString().equals(y.toString()));
    }

}

