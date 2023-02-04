package Fundamentals.StringsExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder modifiedText = new StringBuilder();

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) != text.charAt(i+1)) {
                modifiedText.append(text.charAt(i));
            }
            if (i == text.length() - 2) {
                modifiedText.append(text.charAt(i+1));
            }
        }
        System.out.println(modifiedText);
    }
}
