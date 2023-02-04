package Fundamentals.FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            if (command.contains("Move")) {
                int n = Integer.parseInt(command.split("\\|")[1]);
                if (n < message.length()) {
                    String firstPart = message.substring(n);
                    String secondPart = message.substring(0, n);
                    message = firstPart + secondPart;
                }
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split("\\|")[1]);
                String value = command.split("\\|")[2];
                StringBuilder currentMessage = new StringBuilder(message);
                if (index < currentMessage.length());
                currentMessage.insert(index, value);
                message = currentMessage.toString();
            } else if (command.contains("ChangeAll")) {
                String substring = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];
                if (message.contains(substring)) {
                    message = message.replace(substring, replacement);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }
}
