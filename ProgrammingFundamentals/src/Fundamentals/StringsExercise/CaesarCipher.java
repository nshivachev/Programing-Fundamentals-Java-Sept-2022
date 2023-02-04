package Fundamentals.StringsExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();
        for (char symbol : text.toCharArray()) {
            encryptedText = encryptedText.append((char)(symbol + 3));
        }
        System.out.println(encryptedText);
    }
}
