package Fundamentals.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays
                .stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();;

        while (!command.equals("Go Shopping!")) {
            if (command.contains("Urgent")) {
                String product = command.split("\\s+")[1];
                if (!shoppingList.contains(product)) {
                    shoppingList.add(0, product);
                }
            } else if (command.contains("Unnecessary")) {
                String product = command.split("\\s+")[1];
                if (shoppingList.contains(product)) {
                    shoppingList.remove(product);
                }
            } else if (command.contains("Correct")) {
                String oldName = command.split("\\s+")[1];
                String newName = command.split("\\s+")[2];
                if (shoppingList.contains(oldName)) {
                    shoppingList.set(shoppingList.indexOf(oldName), newName);
                }
            } else if (command.contains("Rearrange")) {
                String product = command.split("\\s+")[1];
                if (shoppingList.contains(product)) {
                    shoppingList.remove(product);
                    shoppingList.add(product);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
