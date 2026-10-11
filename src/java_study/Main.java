package java_study;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] t = {1, 2, 3};
        for (int v : t) {
            v = v * 2;
        }
        System.out.println(Arrays.toString(t));
    }
}
