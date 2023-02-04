package Fundamentals.FinalExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] currentInput = input.split(">>>");
            String command = currentInput[0];
            switch (command) {
                case "Contains":
                    if (key.contains(currentInput[1])) {
                        System.out.println(key + " contains " + currentInput[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(currentInput[2]);
                    int endIndex = Integer.parseInt(currentInput[3]);
                    String substring =  key.substring(startIndex, endIndex);
                    if (currentInput[1].equals("Upper")) {
                        key = key.replace(substring, substring.toUpperCase());
                    } else if (currentInput[1].equals("Lower")) {
                        key = key.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(currentInput[1]);
                    endIndex = Integer.parseInt(currentInput[2]);
                    substring = key.substring(startIndex, endIndex);
                    key = key.replace(substring, "");
                    System.out.println(key);
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}
