package java_study.day19;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarmUp {
    public static void main(String[] args) {

        System.out.println(parseIntOrNull("42"));         // 42
        System.out.println(parseIntOrNull(" -7 "));       // -7
        System.out.println(parseIntOrNull("+5"));         // 5
        System.out.println(parseIntOrNull("4.2"));        // null
        System.out.println(parseIntOrNull(""));           // null
        System.out.println(parseIntOrNull(null));         // null
        System.out.println(parseIntOrNull("1234567890")); // null

        System.out.println(parseAmount("12"));      // 12
        System.out.println(parseAmount("12.5"));    // 12.5
        System.out.println(parseAmount("12,50"));   // 12.5
        // parseAmount("12,505") → "Wrong amount number"
        // parseAmount("abc")    → "Wrong amount number"

        System.out.println(confirmText(JOptionPane.YES_OPTION));      // YES
        System.out.println(confirmText(JOptionPane.CLOSED_OPTION));   // CLOSED
        System.out.println(confirmText(JOptionPane.CANCEL_OPTION));   // CANCEL

        System.out.println(isYes("TAK"));     // true
        System.out.println(isYes(" t "));     // true
        System.out.println(isYes("Yes"));     // true
        System.out.println(isYes("nie"));     // false
        System.out.println(isYes(null));      // false
        System.out.println(isYes("takk"));    // true
    }

    public static Integer parseIntOrNull(String s) {
        if (s == null || s.isBlank()) {
            return null;
        }
        String trimmed = s.trim();
        if (!trimmed.matches("(-|\\+)\\d{1,9}")) {
            return null;
        }
        return Integer.parseInt(trimmed);
    }

    public static double parseAmount(String s) {
        if (s == null || s.isBlank()) {
            throw new IllegalArgumentException("Amount cannot be null or empty");
        }
        if (!s.matches("\\d{2}|\\d{2}\\.\\d{0,2}|\\d{2},\\d{0,2}")) {
            throw new IllegalArgumentException("Wrong amount number");
        }
        return Double.parseDouble(s.replace(',', '.'));
    }

    public static String confirmText(int option) {
        if (option == 0) {
            return "YES";
        } else if (option == 1) {
            return "NO";
        } else if (option == 2) {
            return "CANCEL";
        } else if (option == -1) {
            return "CLOSED";
        } else {
            throw new IllegalArgumentException("don't confirmed any option");
        }
    }

    public static boolean isYes(String answer) {
        if (answer == null) {
            return false;
        }
        String argument = answer.trim().toLowerCase();
        Matcher yes = Pattern.compile("yes|y|tak|t").matcher(argument);
        while (yes.find()) {
            return true;
        }
        return false;
    }
}
