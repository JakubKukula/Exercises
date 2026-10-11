package java_study.day06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Loops.multiplicationTable();
//      1	2	3	4	5
//      2	4	6	8	10
//      3	6	9	12	15
//      4	8	12	16	20
//      5	10	15	20	25
        System.out.println(Loops.evenSumIf()); //2550
        System.out.println(Loops.evenSumContinue()); //2550
//        System.out.println(Loops.guessGame());

//        Ekperyment 4a i 4b

        int[] board = {1, 2, 3};
        for (int i = 0; i <= board.length; i++) {
//            System.out.println(board[i]);
//            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }

        for (int i = 1; i <= 5; i++) {
        }
//        System.out.println(i);

//        java: cannot find symbol
//        symbol:   variable i
//        location: class java_study.day06.Main

        int[] numbers = {4, 9, 1, 7, 3};

        System.out.println(ArrayPractice.sum(numbers));

        System.out.println(ArrayPractice.average(numbers));

        System.out.println(ArrayPractice.max(numbers));

        System.out.println(ArrayPractice.min(numbers));

        System.out.println(ArrayPractice.countEven(null));

        ArrayPractice.printReverse(numbers);
        System.out.println();

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        ArrayPractice.printMatrix(matrix);

        System.out.println(ArrayPractice.diagonalSum(matrix));

        ArrayPractice.doubleAll(numbers); // mnoży każdy element razy 2

        System.out.println(Arrays.toString(numbers)); // 8, 18, 2, 14, 6

        ArrayPractice.replace(numbers); // nie wpłynie na tablicę numbers to t tworzy nowy obiekt który istnieje tylko
        // w metodzie i po zakończeniu znika

        System.out.println(Arrays.toString(numbers)); // 8, 18, 2, 14, 6

    }
}
