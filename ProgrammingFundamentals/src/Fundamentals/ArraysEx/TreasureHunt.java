package Fundamentals.ArraysEx;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");
            switch (commandParts[0]) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        boolean alreadyExist = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (commandParts[i].equals(treasureChest[j])) {
                                alreadyExist = true;
                                break;
                            }
                        }
                        if (!alreadyExist) {
                            treasureChest = (commandParts[i] + " " + String.join(" ", treasureChest)).split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index >= 0 && index < treasureChest.length) {
                        String dropItem = treasureChest[index];
                        for (int i = index + 1; i < treasureChest.length; i++) {
                            treasureChest[i - 1] = treasureChest[i];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;
                    }
                    break;
                case "Steal":
                    int stealingItems = Integer.parseInt(commandParts[1]);
                    if (stealingItems >= 0 && stealingItems < treasureChest.length) {
                        for (int i = 0; i < stealingItems; i++) {
                            System.out.print(treasureChest[treasureChest.length - stealingItems + i]);
                            if (i != stealingItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[treasureChest.length - stealingItems];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = treasureChest[i];
                        }
                        treasureChest = tempChest;
                    } else if (stealingItems >= 0) {
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }

        String treasureLength = String.join("", treasureChest);
        int lengthCounter = 0;
        for (int i = 0; i < treasureLength.length(); i++) {
            lengthCounter++;
        }
        if (lengthCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", (1.0 * lengthCounter) / treasureChest.length );
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
