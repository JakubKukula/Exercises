package java_study.day20.string.stringbuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(initials("jan maria kowalski"));    // J.M.K.
        System.out.println(initials("  Anna   Nowak "));       // A.M.
        System.out.println(initials(""));                      // ""
        System.out.println(reverseWords(" ala  ma kota "));        // kota ma ala
        System.out.println(reverseWords("jedno"));                 // jedno
        System.out.println(countVowels("Ala Ma KOTA"));            // 5
        System.out.println(countVowels("xyz"));                    // 1
        System.out.println(countVowels(null));                     // 0
        System.out.println(mask("1234567890"));                 // ******7890
        System.out.println(mask("1234"));                       // 1234
        System.out.println(mask("12345"));                      // *2345
    }

    public static String initials(String fullName) {
        String result = "";
        if (fullName == null || fullName.isBlank()) {
            return result;
        }
        String[] fullNameBoard = fullName.trim().split(" ");
        for (String word : fullNameBoard) {
            if (word.isBlank()) {
                continue;
            }
            result += word.charAt(0) + ".";
        }
        result = result.toUpperCase();
        return result;
    }

    public static String reverseWords(String text) {
        String result = "";
        if (text == null || text.isBlank()) {
            return result;
        }
        String[] textBoard = text.trim().split(" ");
        for (int i = textBoard.length - 1; i >= 0; i--) {
            if (textBoard[i].isBlank()) {
                continue;
            }
            if (i != 0) {
                result += textBoard[i] + " ";
            } else {
                result += textBoard[i];
            }

        }
        return result;
    }

    public static int countVowels(String text) {
        if (text == null) {
            return 0;
        }
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int count = 0;
        String textLower = text.toLowerCase();
        for (int i = 0; i < textLower.length(); i++) {
            for (char vowel : vowels) {
                if (textLower.charAt(i) == vowel) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String mask(String number) {
        if (number == null) {
            throw new IllegalArgumentException("Number cannot be null");
        }
        if (number.length() <= 4) {
            return number;
        }
        String result = "";
        for (int i = 0; i < number.length() - 4; i++) {
            result += "*";
        }
        return result + number.substring(number.length() - 4);
    }


}
