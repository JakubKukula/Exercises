package java_study.day07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int x = 10;

        PassByValueLab.incrementInt(x); // wypisuje 10 poniważ w metodzie jest sout ale metoda nie wpływa na zmienna x
        System.out.println(x); // x bez zmiany

        int[] numbers = {1, 2, 3, 4};

        PassByValueLab.incrementArray(numbers); // dla tablicy zmiana poszczególnego elemntu wpływa na faktyczny element
        System.out.println(Arrays.toString(numbers)); // numbers [0] zostało faktycznie zmienione

        System.out.println(PassByValueLab.incrementAndReturn(x)); // pokaże nam liczbę jaka zostanie zwrócona ale nie
        // wpływa na faktyczną zmienna x
        PassByValueLab.incrementAndReturn(x); // nie wpływa na x ponieważ nie nadpisujemy naszego x tylko zwracamy
        x = PassByValueLab.incrementAndReturn(x); // wpływa na wartośc poprzez przypisanie
        System.out.println(x);

        System.out.println(PassByValueLab.countIteration(0, 10, 3)); // 3 tu sie pomyliłem nie policzyłem pierwszej iteracji
        System.out.println(PassByValueLab.countIteration(2, 11, 2)); // 5
        System.out.println(PassByValueLab.countIteration(5, 5, 1)); // 0
        System.out.println(PassByValueLab.countIteration(0, 1, 5)); // 1

    }
}
