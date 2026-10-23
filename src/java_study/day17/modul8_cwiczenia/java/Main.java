package java_study.day17.modul8_cwiczenia.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main(String[] args) {
        // Ć1–Ć3: klasy znaków
        System.out.println("K".matches("[A-Z]"));            // true
        System.out.println("KK".matches("[A-Z]"));           // false
        System.out.println("KK".matches("[A-Z]+"));          // true

        // Ć4–Ć5: negacja
        System.out.println("a".matches("[^aeiouy]"));        // false
        System.out.println("b".matches("[^aeiouy]"));        // true

        // Ć6–Ć9: kwantyfikatory
        System.out.println("".matches("x?"));                // true
        System.out.println("xx".matches("x?"));              // false
        System.out.println("aaa".matches("a{2,}"));          // true
        System.out.println("a".matches("a{2,}"));            // false

        // Ć10–Ć11: kwantyfikator na jednym znaku
        System.out.println("haha".matches("ha+"));           // false
        System.out.println("haaaa".matches("ha+"));          // true

        // Ć12: escapowanie
        System.out.println("1+1".matches("\\d\\+\\d"));      // true
        System.out.println("121".matches("\\d+\\d"));        // false   ← uwaga, tu + nie jest escapowany

        // Ć13: alternatywa
        System.out.println("pies".matches("kot|pi"));        // false

        // Ć14: matches vs find
        System.out.println("tel: 600".matches("\\d+"));                          // false
        System.out.println(Pattern.compile("\\d+").matcher("tel: 600").find());  // true

        // Ć15: find w pętli (ile i jakie fragmenty?)
        Matcher m = Pattern.compile("[A-Z][a-z]+").matcher("Ala i Ola oraz Ewa");
        while (m.find()) {
            System.out.println(m.group());
        }
        // wypisze:
        /*
        Ala
        Ola
        Ewa
         */
    }
}
