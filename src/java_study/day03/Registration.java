package java_study.day03;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name");
        String fullName = scanner.nextLine(); // poprawnie zapisze imie i nazwisko
        while (!scanner.hasNextInt()){
            System.out.println("This is not number, try again");
            scanner.next();
        }
        System.out.println("Enter age");
        int age = scanner.nextInt();// zapiszę wiek
        scanner.nextLine(); // pierwsze rozwiązanie
//         int age = Integer.parseInt(scanner.nextLine()); drugie rozwiązanie
        //double height = Double.parseDouble(scanner.nextLine()); // wpisując 1,80 wyrzuci błąd (NumberFormatException)
        System.out.println("Enter height");
        double height = scanner.nextDouble();// wpisując 1.80 wyrzuca błąd InputMismatchException
        scanner.nextLine();
        System.out.println("Enter city");
        String city = scanner.nextLine();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("City: " + city);

        //Full name: Jakub Kukula
        //Age: 27
        //Height: 1.85
        //City: Wroclaw

        scanner.close();

        Scanner scanner1 = new Scanner(System.in);
        String x = scanner1.nextLine();
        System.out.println(x);
    }
}
