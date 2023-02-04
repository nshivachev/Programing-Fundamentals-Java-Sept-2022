package Fundamentals.StringsExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (int i = 0; i < usernames.length; i ++) {
            if (usernames[i].length() >= 3 && usernames[i].length() <= 16) {
                boolean isValid = true;
                for (char symbol : usernames[i].toCharArray()) {
                    if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    System.out.println(usernames[i]);
                }
            }
        }
    }
}
