package java_study.day06;

public class ArrayPractice {

    static int sum(int[] t) {
        if (t == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sum = 0;
        for (int number : t) { // przechodzimi pokażdym elemencie number dodajemy go do sum
            sum += number;
        }
        return sum; // 24
    }

    static double average(int[] t) {
        if (t == null || t.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double sum = 0;
        for (int number : t) {
            sum += number;
        }
        return sum / t.length; //4.8 sumę liczb tablicy dzielimy przez jej długośc
    }

    static int max(int[] t) {
        if (t == null || t.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max = t[0];
        for (int number : t) {
            if (max < number) {
                max = number;
            }
        }
        return max; // 9
    }

    static int min(int[] t) {
        if (t == null || t.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int min = t[0];
        for (int number : t) {
            if (min > number) {
                min = number;
            }
        }
        return min; // 1
    }

    static int countEven(int[] t) {
//        if (t == null) {
//            throw new IllegalArgumentException("Array cannot be null");
//        }
        int count = 0;
        for (int number : t) {
            if (number % 2 == 0) { // warunek sprawdza czy liczba jest parzysta true zmiększa licznik
                count++;
            }
        }
        return count; // 1
    }

    static void printReverse(int[] t) {
        if (t == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (int i = t.length - 1; i >= 0; i--) { // tablica przechodzi od końca tablicy
            System.out.print(t[i] + " "); // 3 7 1 9 4
        }
    }

    static void printMatrix(int[][] m) {
        if (m == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
//      1	2	3
//      4	5	6
//      7	8	9
    }

    static int diagonalSum(int[][] m) {
        if (m == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum; // 15
    }

    static void doubleAll(int[] t) {
        if (t == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (int i = 0; i < t.length; i++) {
            t[i] *= 2;
        }
    }

    static void replace(int[] t) {
        if (t == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        t = new int[]{0, 0, 0};
    }


}
