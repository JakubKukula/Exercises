package java_study;

public class Main {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.own = 5;
        Counter.total = 7;
        System.out.println(c2.own + " " + c2.total);
    }
}

class Counter {
    static int total;
    int own;
}
