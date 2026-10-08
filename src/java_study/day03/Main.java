package java_study.day03;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jakub");
        Person p2 = new Person("Jakub");

        // bez nadpisanego equals
        // System.out.println(p1.equals(p2)); false

        // z nadpisanym equals
        System.out.println(p1.equals(p2)); // true


    }
}
