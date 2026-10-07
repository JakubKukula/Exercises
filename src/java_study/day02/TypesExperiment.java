package java_study.day02;

public class TypesExperiment {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE); // pokaże wartośc odpowiadającej MAX_VALUE
        System.out.println(Integer.MAX_VALUE + 1); // pokaże wartość MIN_VALUE bo aktualna wartość sie zawinie
        System.out.println(7 / 2); // 3
        System.out.println(7 % 2); // nie wiem ale myślę żę 3
        System.out.println(7 / 2.0); // 3.5 bo jedna liczbą dzielącą jest 2.0 czyli wartośc skompiluje sie do dpuble
        System.out.println((int) 9.99); // 9 bo typ jawny jest określony na int a int zwrana liczbę bez przecinka więc obetnie liczby po rzecinku
        System.out.println((int) -9.99); // -9 i taki sam powód jak wyżej
        System.out.println((byte) 200); // wyrzuci bład bo byte mieści wartości od -128 do 127
        System.out.println('A' + 'B'); // 131 bo char pod znakiem przechowuje liczbę
        System.out.println("" + 'A' + 'B'); // AB bo na początku jest określiny String
        System.out.println(0.1 + 0.2); // nie bedzie to rwne 0.3 do double jest nie precyzyjny
    }
}
