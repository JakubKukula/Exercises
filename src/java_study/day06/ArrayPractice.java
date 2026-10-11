package java_study.day06;

public class ArrayPractice {

    static int sum(int[] t) {
        if (t == null) {
            throw new IllegalArgumentException("Board cannot be null");
        }
        int sum = 0;
        for (int i : t) { // przechodzimi pokażdym elemencie i dodajemy go do sum
            sum += i;
        }
        return sum; // 24
    }

    static double average(int[] t) {
        if (t == null || t.length == 0) {
            throw new IllegalArgumentException("Board cannot be null or empty");
        }
        double sum = 0;
        for (int i : t) {
            sum += i;
        }
        return sum / t.length; //4.8 sumę liczb tablicy dzielimy przez jej długośc
    }

    static int max(int[] t) {
        if (t == null || t.length == 0) {
            throw new IllegalArgumentException("Board cannot be null or empty");
        }
        int max = t[0];
        for (int i : t) {
            if (max < i) {
                max = i;
            }
        }
        return max; // 9
    }

    static int min(int[] t) {
        if (t == null || t.length == 0) {
            throw new IllegalArgumentException("Board cannot be null or empty");
        }
        int min = t[0];
        for (int i : t) {
            if (min > i) {
                min = i;
            }
        }
        return min; // 1
    }

    static int countEven(int[] t) {
        int count = 0;
        for (int i : t) {
            if (i % 2 == 0) { // warunek sprawdza czy liczba jest parzysta true zmiększa licznik
                count++;
            }
        }
        return count; // 1
    }

    static void printReverse(int[] t) {
        for (int i = t.length - 1; i >= 0; i--) { // tablica przechodzi od końca tablicy
            System.out.print(t[i]);
        }
    }

    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int diagonalSum(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    static void doubleAll(int[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i] *= 2;
        }
    }

    static void replace(int[] t) {
        t = new int[]{0, 0, 0};
    }


}
