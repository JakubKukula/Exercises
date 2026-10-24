package java_study.day18;

import javax.swing.*;

public class WarmUp {
    static void main(String[] args) {


    }

    public static Integer parseIntOrNull(String s) {
        Integer number = null;
        do {
            if (s == null || s.isBlank()){
                break;
            }
            s = s.trim();
            if (s.matches("\\d{1,9}")){
                number = Integer.parseInt(s);
            } else {

            }
        } while (number == null);
        return number;
    }
}
