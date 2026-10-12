package java_study;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 20;
        int c = 0;
        while (n > 1) {
            n = n / 2;
            c++;
        }
        System.out.println(n + " " + c);
    }


}

