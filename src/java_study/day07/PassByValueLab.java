package java_study.day07;

import java.util.Arrays;

public class PassByValueLab {

    static void incrementInt(int n) {
        n++;
        System.out.println(n);
    }

    static void incrementArray(int[] t) {
        t[0]++;
        System.out.println(Arrays.toString(t));
    }

    static int incrementAndReturn(int n) {
        n++;
        return n;
    }

    static int countIteration(int start, int end, int step) {
        int count = 0;
        for (int i = start; i < end; i+=step) {
            count++;
        }
        return count;
    }
}
