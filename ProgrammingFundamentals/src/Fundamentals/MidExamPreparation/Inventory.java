package Fundamentals.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            if (command.contains("Collect")) {
                String itemToAdd = command.split(" ")[2];
                if (!itemsList.contains(itemToAdd)) {
                    itemsList.add(itemToAdd);
                }
            } else if (command.contains("Drop")) {
                String itemToDrop = command.split(" ")[2];
                if (command.contains(itemToDrop)) {
                    itemsList.remove(itemToDrop);
                }
            } else if (command.contains("Combine")) {
                String oldItem = command.split(" ")[3].split(":")[0];
                String newItem = command.split(" ")[3].split(":")[1];
                if (itemsList.contains(oldItem)) {
                    itemsList.add(itemsList.indexOf(oldItem) + 1, newItem);
                }
            } else if (command.contains("Renew")) {
                String itemToRenew = command.split(" ")[2];
                if (itemsList.contains(itemToRenew)) {
                    itemsList.remove(itemToRenew);
                    itemsList.add(itemToRenew);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(itemsList.toString().replaceAll("[\\[\\]]", ""));
    }
}
