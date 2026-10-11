package java_study.day06;

import java.util.Scanner;

public class Loops {

    private static final int SECRET = 7;

    static void multiplicationTable() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    static int evenSumIf() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int evenSumContinue() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        return sum;
    }

    static int guessGame() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;

        do {
            System.out.println("Enter number:");

            while (!scanner.hasNextInt()) {  //sprawdza czy podany została licbza
                System.out.println("Error: enter a number"); // jeżeli nie
                scanner.next();
            }

            number = scanner.nextInt();  // jeżeli tak to ją zapisujemy w zmiennej number
            scanner.nextLine();  // usuwamy pusty bufor
            count++; // zwiększamy licznik

            if (number < SECRET) {
                System.out.println("Too small");
            } else if (number > SECRET) {
                System.out.println("Too big");
            } else {
                System.out.println("Correct!");
            } // instrukcja warunkowa

        } while (SECRET != number); // jeżeli true to wraca na góre do Enter number jeżeli false koniec do-while
        return count;
    }
}

