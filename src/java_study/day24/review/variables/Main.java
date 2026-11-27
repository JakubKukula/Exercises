package java_study.day24.review.variables;

public class Main {
    public static void main() {

        String firstName = "Anna";
        String lastName = "Kowalska";
        int evidenceNumber = 10452;
        int age = 34;
        boolean active = true;
        char contractType = 'E';

        System.out.println("Pracownik: " + firstName + " " + lastName);
        System.out.println("Numer ewidencyjny: " + evidenceNumber);
        System.out.println("Wiek: " + age);
        System.out.println("Aktywny: " + active);
        System.out.println("Rodzaj umowy: " + contractType);

        String login = (firstName.charAt(0) + lastName).toLowerCase();
        System.out.println("Login: " + login);
        System.out.println("Długość loginu: " + login.length());

        System.out.println(5/0.0);
        System.out.println(-5%0.0);


    }
}
