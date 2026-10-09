package java_study.day04;

import java.util.Scanner;

public class Condition {

    private static final int MIN_BDB = 90;
    private static final int MIN_DB = 75;
    private static final int MIN_DST = 50;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String r = scanner.nextLine();
        System.out.println(a);
        System.out.println(r);

        System.out.println("Enter points");

        while (!scanner.hasNextInt()) {
            System.out.println("Error: enter points");
            scanner.next();
        }
        int points = scanner.nextInt();

        if (points >= MIN_BDB) { // 90
            System.out.println("bdb");
        } else if (points >= MIN_DB) { // 75 89
            System.out.println("db");
        } else if (points >= MIN_DST) { // 50 74
            System.out.println("dst");
        } else { // 49
            System.out.println("ndst");
        }

        System.out.println("Enter day of the week");

        while (!scanner.hasNextInt()) {
            System.out.println("Error: number of day");
            scanner.next();
        }

        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong day");
        }

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday"); // po usunięciu break wypisamo dwa dni tygodnia
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
        }

        int x = 3;
        int y = x++ + ++x; // 3  + -> 3+1 = 4+1 = 5 , y = 3 + 5
        System.out.println(x + " " + y); // x = 5 bo został dwa razy zwiększony y = 8

        int k = 0;
        if (k++ == 0 && k++ == 1) { // (true bo k = 0 -> k + 1 && true bo k = 1 -> 1 + 1)
            System.out.println("wewnątrz: " + k); // wewnątrz: 2
        }
        System.out.println("po: " + k); //po: 2
    }
}
