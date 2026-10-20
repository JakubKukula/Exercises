package java_study.day13.warm.up;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(1234));    //10
        System.out.println(sumDigits(0));       //0
        System.out.println(sumDigits(-507));
        /*
        n      cyfra    suma
        507     7        7
        50      0        7
        5       5        12
        warunek n false return -> 12
         */
        System.out.println(isPrime(0)); // false
        System.out.println(isPrime(2)); // true
        System.out.println(isPrime(9)); // false
        System.out.println(isPrime(17)); // true
        System.out.println(countDivisible(1, 10, 3)); // 3
        System.out.println(countDivisible(3, 3, 3)); // 1
        //System.out.println(countDivisible(10, 1, 2)); // IllegalArgumentException: From cannot be greater for to
        System.out.println(average(1, 2, 2)); // 1.6666666666666667

        System.out.println("Arrays");
        System.out.println(max(new int[]{3, 8, 1}));            // 8
        System.out.println(max(new int[]{-5, -2, -9}));         // -2
        /*
        arr[i]   cyfra  >  max   max =
        -5        -5       -5      -5
        -2        -2       -5      -2
        -9        -9       -2      -2
        return -2
         */
        System.out.println(indexOfLast(new int[]{4, 7, 4, 1}, 4));   // 2
        System.out.println(indexOfLast(new int[]{4, 7, 4, 1}, 9));   // -1
        System.out.println(isSorted(new int[]{}));              // true
        System.out.println(isSorted(new int[]{1, 2, 2, 3}));    // true
        System.out.println(isSorted(new int[]{1, 3, 2}));       // false

        int[] orig = {1, 2, 3};
        int[] rev = reversed(orig);
        System.out.println(Arrays.toString(rev));               // 321
        System.out.println(Arrays.toString(orig));              // 123   ← po wywołaniu
    }

    // Wejściówka #6: liczby i pętle - start 14.10
    public static int sumDigits(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n = n / 10;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        boolean isPrime = true;
        int x = 2;
        while (x < n) {
            if (n % x == 0) {
                isPrime = false;
            }
            x++;
        }
        return isPrime;
    }

    public static int countDivisible(int from, int to, int k) {
        if (from > to) {
            throw new IllegalArgumentException("From cannot be greater for to");
        }
        int count = 0;
        for (int i = from; i <= to; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static double average(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }
    // koniec 14.27

    //Wejściówka #7: tablice - start 14.35
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int result = arr[0];
        for (int number : arr) {
            if (number > result) {
                result = number;
            }
        }
        return result;
    }

    public static int indexOfLast(int[] arr, int value) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        return index;
    }

    public static boolean isSorted(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static int[] reversed(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int[] result = new int[arr.length];
        int x = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[x] = arr[i];
            x++;
        }
        return result;
    }
    // koniec - 14.50



}
