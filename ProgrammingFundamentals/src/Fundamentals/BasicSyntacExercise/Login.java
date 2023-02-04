package Fundamentals.BasicSyntacExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            password += symbol;
        }

        String userPassword = scanner.nextLine();
        int i = 0;

        while (!userPassword.equals(password)) {
            i++;
            if (i == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            userPassword = scanner.nextLine();
        }

        if (userPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
