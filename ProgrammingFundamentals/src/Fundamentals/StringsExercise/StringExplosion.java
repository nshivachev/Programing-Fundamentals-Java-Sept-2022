package Fundamentals.StringsExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());
        int totalPower = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '>') {
                totalPower += Integer.parseInt(text.charAt(i + 1) + "");
            } else if (text.charAt(i) != '>' && totalPower > 0){
                text.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }
        System.out.println(text);
    }
}
