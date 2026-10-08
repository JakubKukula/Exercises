package java_study.day03;

import java.util.Scanner;

public class Registration {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine(); // poprawnie zapisze imie i nazwisko
        while (!scanner.hasNextInt()){
            System.out.println("This is not number, try again");
            scanner.next();
        }
        int age = scanner.nextInt();// zapiszę wiek
        scanner.nextLine(); // pierwsze rozwiązanie
//         int age = Integer.parseInt(scanner.nextLine()); drugie rozwiązanie
        //double growth = Double.parseDouble(scanner.nextLine()); // wpisując 1,80 wyrzuci błąd (NumberFormatException)
        double growth = scanner.nextDouble();// wpisując 1.80 wyrzuca błąd InputMismatchException
        scanner.nextLine();
        String city = scanner.nextLine(); // zapisze pusty String ponieważ nextint zabiera samą liczbę a enter zostaje

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Growth: " + growth);
        System.out.println("City: " + city);

        //Full name: Jakub Kukula
        //Age: 27
        //Growth: 1.85
        //City: Wroclaw

        scanner.close();

        Scanner scanner1 = new Scanner(System.in);
        String x = scanner1.nextLine();
        System.out.println(x);
    }
}
