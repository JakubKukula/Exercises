package java_study.day16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarmUp {
    public static void main(String[] args) {

        System.out.println(isValidPostalCode("00-950"));     // true
        System.out.println(isValidPostalCode("00950"));      // false
        System.out.println(isValidPostalCode(null));         // false

        System.out.println(isStrongPassword("Haslo123"));    // true
        System.out.println(isStrongPassword("haslo123"));    // false
        System.out.println(isStrongPassword("Haslo12"));     // false   ← długość
        System.out.println(isStrongPassword("HasloHaslo"));  // false

        System.out.println(countNumbers("Ala ma 2 koty i 15 rybek"));   // 3
        /*
        digit.find      count
            2             1
            1             2
            5             2
         */
        System.out.println(countNumbers("123"));                        // 3
        System.out.println(countNumbers("brak liczb"));                 // 0
        System.out.println(countNumbers(""));                           // 0

        System.out.println(isValidEmail("jan.kowalski@gmail.com"));   // true
        System.out.println(isValidEmail("jan@gmail"));                // false
        System.out.println(isValidEmail("@gmail.com"));               // false
        System.out.println(isValidEmail("jan@gmailxcom"));            // false   ← uwaga
        System.out.println(isValidEmail("jan@@gmail.com"));           // false

    }

    // Wejściówka #10: walidacja regexem start - 15.50

    public static boolean isValidPostalCode(String s) {
        if (s == null) {
            return false;
        }
        return s.matches("\\d{2}-\\d{3}");
    }

    public static boolean isStrongPassword(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() < 8) {
            return false;
        }
        // wydajemi mi sie to logiczne i proste
        boolean bigLetter = Pattern.compile("[A-Z]").matcher(s).find();
        boolean smallLetter = Pattern.compile("[a-z]").matcher(s).find();
        boolean digit = Pattern.compile("\\d").matcher(s).find();
        return bigLetter && smallLetter && digit;
    }

    public static int countNumbers(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        Matcher digit = Pattern.compile("\\d").matcher(text);
        int count = 0;
        while (digit.find()) {
            count++;
        }
        return count;
    }

    // przerwa 16.15

    // start 19.25

    public static boolean isValidEmail(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        return s.matches("[\\w.]+@\\w+\\.\\w{2,3}");
    }

    // koniec 19.35


}
