package java_study.day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarmUp {
    static void main(String[] args) {

        System.out.println(isValidPhone("123-456-789"));    // true
        System.out.println(isValidPhone("123456789"));      // true
        System.out.println(isValidPhone("123-456789"));     // false
        System.out.println(isValidPhone("12-3456-789"));    // false
        System.out.println(isValidPhone(null));             // false

        System.out.println(countWords("Ala ma 2 koty"));        // 3
        /*
        pattern find    count
        Ala             1
        ma              2
        2               false
        koty            3
        metoda nie zakładał w poleceniu użycia group() tylko policzenia ilości słów
         */
        System.out.println(countWords("Ala-ma-kota"));          // 3
        System.out.println(countWords("123 456"));              // 0
        System.out.println(countWords(""));                     // 0

        System.out.println(isValidTime("00:00"));    // true
        System.out.println(isValidTime("23:59"));    // true
        System.out.println(isValidTime("24:00"));    // false
        System.out.println(isValidTime("19:60"));    // false
        System.out.println(isValidTime("9:30"));     // false
        // mozna by było zrobić zeby 9.30 tez była true wystarczy uzyc |

        System.out.println(maskDigits("PIN 1234"));   // PIN ****
        System.out.println(maskDigits("brak"));       // brak
        System.out.println(maskDigits(""));           //
    }
    //Wejściówka #11 start - 14.00

    public static boolean isValidPhone(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("\\d{3}-\\d{3}-\\d{3}|\\d{9}");
    }

    public static int countWords(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        Matcher word = Pattern.compile("[A-Za-z]+").matcher(text);
        int countWord = 0;
        while (word.find()) {
            countWord++;
        }
        return countWord;
    }

    public static boolean isValidTime(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("[0-1]\\d:[0-5]\\d|2[0-3]:[0-5]\\d");
    }

    public static String maskDigits(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String sign = String.valueOf(s.charAt(i));
            if (sign.matches("\\d")) {
                result += "*";
            } else {
                result += sign;
            }
        }
        return result;
    }

    //koniec 14.21
}
