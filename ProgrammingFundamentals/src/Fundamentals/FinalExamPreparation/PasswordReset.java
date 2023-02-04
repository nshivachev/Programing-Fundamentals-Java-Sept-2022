package Fundamentals.FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            StringBuilder newPassword = new StringBuilder();
            if (command.equals("TakeOdd")) {
                for (int i = 0; i < password.length(); i++) {
                    if (i % 2 != 0) {
                        newPassword.append(password.charAt(i));
                    }
                }
                password = String.valueOf(newPassword);
                System.out.println(password);
            } else if (command.contains("Cut")) {
                newPassword.append(password);
                int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);
                newPassword.delete(startIndex, startIndex + length);
                password = String.valueOf(newPassword);
                System.out.println(password);
            } else if (command.contains("Substitute")) {
                String substring = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];
                if (password.contains(substring)) {
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
