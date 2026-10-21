package java_study.day15;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        System.out.println(repeat("ab", 3));                 // ababab
        System.out.println(repeat("x", 0));                  //
        System.out.println(compress("aaabbc"));                 // a3b2c1
        /*
        i      char  char(i) == char(j)     j    count      result
        0       a         false             a      3          a3
        1       a         true              continue          a3
        2       a         true              continue          a3
        3       b         false             b      2          a3b2
        4       b         true              continue          a3b2
        5       c         false             c      1          a3b2c1
        pętla j liczy ilośc wystąpieć znaku z pętli i
         */
        System.out.println(compress("abc"));                    // a1b1c1
        System.out.println(compress(""));                       //
        System.out.println(compressRuns("aabaa"));              //a2b1a2
        System.out.println(capitalize("jAVA"));                 // Java
        System.out.println(capitalize("a"));                    // A
        System.out.println(capitalize(""));                     //
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("aab", "abb"));         // false
        System.out.println(isAnagram("ab", "abc"));          // false

    }

    // Wejściówka #9: metody na Stringach - start 13:35
    public static String repeat(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be less than 0");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String compress(String s) {
        if (s == null) {
            throw new IllegalArgumentException("s cannot be null");
        }
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char sign = s.charAt(i);
            if (result.contains(String.valueOf(sign))) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == sign) {
                    count++;
                }
            }
            result += String.valueOf(sign) + count;
        }
        return result;
    }

    public static String compressRuns(String s) {
        if (s == null) {
            throw new IllegalArgumentException("s cannot be null");
        }
        String result = "";

        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            char sign = s.charAt(i);
            if ((i + 1) < s.length() && sign == s.charAt(i + 1)) {
                count++;
            } else {
                result += String.valueOf(sign) + count;
                count = 1;
            }
        }
        return result;
    }

    public static String capitalize(String s) {
        if (s == null) {
            throw new IllegalArgumentException("s cannot be null");
        }
        if (s.isEmpty()) {
            return "";
        }
        String result = "";
        result = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        return result;
    }

    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("a and b cannot be null");
        }
        if (a.length() != b.length()) {
            return false;
        }
        String[] arrayA = a.split("");
        String[] arrayB = b.split("");

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        return Arrays.equals(arrayA, arrayB);
    }

    // koniec 13:55


}
