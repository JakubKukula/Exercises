package java_study.day20.regex.find.dowhile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println(isValidPhone("123-456-789"));        // true
        System.out.println(isValidPhone("+48 123456789"));      // true
        System.out.println(isValidPhone("123-456789"));         // false
        System.out.println(isValidPhone("12345678"));           // false
        System.out.println(isValidPhone(null));                 // false
        System.out.println(sumNumbersInText("a12b3c40"));       // 3
        System.out.println(sumNumbersInText("x-5y"));           // 5
        System.out.println(sumNumbersInText("brak"));           // 0
        System.out.println(countDigits(0));                  // 1
        System.out.println(countDigits(-123));               // 3
        System.out.println(countDigits(1000));               // 4

    }

    public static boolean isValidPhone(String phone) {
        if (phone == null) {
            return false;
        }
        return phone.matches("(\\+48) \\d{9}|\\d{3}-\\d{3}-\\d{3}");
    }

    public static int sumNumbersInText(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }
        Matcher number = Pattern.compile("\\d+").matcher(text);
        int sum = 0;
        while (number.find()) {
            sum += Integer.parseInt(number.group());
        }
        return sum;
    }

    public static int countDigits(int n) {
        int number = Math.abs(n);
        int count = 0;
        do {
            count++;
            number = number / 10;
        } while (number > 0);
        return count;
    }

}
