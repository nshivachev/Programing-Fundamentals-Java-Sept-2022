package Fundamentals.StringsLab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder digitsOnly = new StringBuilder();
        StringBuilder lettersOnly = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                digitsOnly.append(ch);
            } else if (Character.isLetter(text.charAt(i))) {
                lettersOnly.append(ch);
            } else {
                others.append(ch);
            }
        }
        System.out.println(digitsOnly);
        System.out.println(lettersOnly);
        System.out.println(others);
    }
}
