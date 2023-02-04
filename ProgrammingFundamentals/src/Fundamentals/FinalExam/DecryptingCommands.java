package Fundamentals.FinalExam;

import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            if (command.contains("Replace")) {
                String currentSymbol = command.split("\\s+")[1];
                String newSymbol = command.split("\\s+")[2];
                if (text.contains(currentSymbol)) {
                    text = text.replace(currentSymbol, newSymbol);
                }
                System.out.println(text);
            } else if (command.contains("Cut")) {
                int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                int endIndex = Integer.parseInt(command.split("\\s+")[2]);
                if (startIndex >= 0 && endIndex >= 0 && startIndex < text.length() && endIndex < text.length()) {
                    StringBuilder currentText = new StringBuilder(text);
                    text = currentText.delete(startIndex, endIndex + 1).toString();
                    System.out.println(text);
                } else {
                    System.out.println("Invalid indices!");
                }
            } else if (command.contains("Make")) {
                String upperLowerCase = command.split("\\s+")[1];
                if (upperLowerCase.equals("Upper")) {
                    text = text.toUpperCase();
                } else {
                    text = text.toLowerCase();
                }
                System.out.println(text);
            } else if (command.contains("Check")) {
                String substring = command.split("\\s+")[1];
                if (text.contains(substring)) {
                    System.out.println("Message contains " + substring);
                } else {
                    System.out.println("Message doesn't contain " + substring);
                }
            } else if (command.contains("Sum")) {
                int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                int endIndex = Integer.parseInt(command.split("\\s+")[2]);

                if (startIndex >= 0 && endIndex >= 0 && startIndex < text.length() && endIndex < text.length()) {
                    String substring = text.substring(startIndex, endIndex + 1);
                    int symbolSum = 0;
                    for (char symbol : substring.toCharArray()) {
                        symbolSum += symbol;
                    }
                    System.out.println(symbolSum);
                } else {
                    System.out.println("Invalid indices!");
                }

            }
            command = scanner.nextLine();
        }
    }
}
