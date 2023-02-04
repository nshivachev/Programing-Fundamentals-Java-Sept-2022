package Fundamentals.FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String[] commandArr = command.split(":\\|:");
            if (command.contains("InsertSpace")) {
                int index = Integer.parseInt(commandArr[1]);
                if (index >= 0 && index < message.length()) {
                    StringBuilder currentMessage = new StringBuilder(message);
                    currentMessage.insert(index, " ");
                    message = currentMessage.toString();
                    System.out.println(message);
                }
            } else if (command.contains("Reverse")) {
                String substring = commandArr[1];
                if (message.contains(substring)) {
                    message = message.replaceFirst(Pattern.quote(substring), "");
                    StringBuilder currentMessage = new StringBuilder(substring);
                    currentMessage.reverse();
                    message += currentMessage.toString();
                    System.out.println(message);
                } else {
                    System.out.println("error");
                }
                
            } else if (command.contains("ChangeAll")) {
                String substring = commandArr[1];
                String replacement = commandArr[2];
                if (message.contains(substring)) {
                    message = message.replace(substring, replacement);
                }
                System.out.println(message);
            }
            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
