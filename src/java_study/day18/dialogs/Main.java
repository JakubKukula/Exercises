package java_study.day18.dialogs;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(Integer.parseInt("007"));            // 7
        System.out.println(Integer.parseInt("-0"));             // 0
        System.out.println(Double.parseDouble("3"));            // 3.0
        System.out.println(Double.parseDouble("  4.5  "));      // 4.5
        System.out.println(Double.parseDouble("7,25".replace(',', '.')));   // 7.25
        System.out.println("25" + 1);                           // 251
        System.out.println(Integer.parseInt("25") + 1);         // 26
        System.out.println("tak".equals(null));                 // false
        // Dla poniższych napisz tylko nazwę wyjątku (nie uruchamiaj tych linijek razem z resztą):
        // Integer.parseInt("1 000")      → NumberFormatExeption
        // Integer.parseInt("3.0")        → NumberFormanExeption
        // Double.parseDouble(null)       → NullPointerExeption
        // Integer.parseInt(null)         → NumberFormatExeption

        String answer;
        int age = 0;
        do {
            answer = JOptionPane.showInputDialog(null, "Enter age");
            if (answer == null || answer.isBlank()) {
                return;
            }
            answer = answer.trim();
            if (!answer.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "This is not a number");
            } else {
                age = Integer.parseInt(answer);
                if (age < 1 || age > 120) {
                    JOptionPane.showMessageDialog(null, "Age must be from 1 to 120");
                }
            }
        } while (age < 1 || age > 120);
        JOptionPane.showMessageDialog(null, "For 10 years you will be " + (age + 10) +
                " years older");

        //jedyne co nie wiedziałem to jak to fajnie poukładać bo napisanie samego kodu poszło szybko
    }
}
