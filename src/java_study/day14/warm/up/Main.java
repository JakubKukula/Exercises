package java_study.day14.warm.up;

public class Main {
    public static void main(String[] args) {

        System.out.println(countChar("banana", 'a'));                     // 3
        System.out.println(countChar("", 'a'));                           // 0
        System.out.println(isPalindrome("kajak"));                           // true
        System.out.println(isPalindrome("Kajak"));                           // false
        System.out.println(isPalindrome("ab"));                              // false
        System.out.println(longestWord(new String[]{"kot", "pies", "ryba"}));   // pies
        System.out.println(longestWord(new String[]{"pies", "Ryba"}));// Ryba / p = 112,R = 82 i porównując R do p = -30 to R jest pierwsze    ← uwaga
        System.out.println(longestWord(new String[]{}));                        // null
        System.out.println(grade(49));//2
        System.out.println(grade(50));//3
        System.out.println(grade(69));//3
        System.out.println(grade(70));//4
        System.out.println(grade(84));//4
        System.out.println(grade(85));//5
        System.out.println(grade(100));//5
        System.out.println(grade(101));// wyjątek


    }

    //  Wejściówka #8: Stringi i warunki start 19.15

    public static int countChar(String s, char c) {
        if (s == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char sing = s.charAt(i);
            if (c == sing) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        s = s.trim();
        boolean isPalindrome = true;
        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            char signI = s.charAt(i);
            char signJ = s.charAt(j);
            if (signI != signJ) {
                isPalindrome = false;
                break;
            } else {
                j--;
            }
        }
        return isPalindrome;
    }

    public static String longestWord(String[] words) {
        if (words == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        String result = null;
        for (String word : words) {
            if (result == null || result.length() < word.length()) {
                result = word;
                continue;
            }
            int first = word.compareTo(result);
            if (result.length() == word.length() && first < 0) {
                result = word;
            }
        }
        return result;
    }

    public static int grade(int points) {
        if (points >= 0 && points < 50) {
            return 2;
        } else if (points >= 50 && points < 70) {
            return 3;
        } else if (points >= 70 && points < 85) {
            return 4;
        } else if (points >= 85 && points <= 100) {
            return 5;
        } else {
            throw new IllegalArgumentException("Wrong number of points");
        }
    }


}
