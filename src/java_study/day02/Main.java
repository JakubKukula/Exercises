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
    }
}
