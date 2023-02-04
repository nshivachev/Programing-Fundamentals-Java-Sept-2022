package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            String command = scanner.nextLine();
            String[] commandArr = command.split(", ");
            if (command.contains("Add")) {
                if (!cards.contains(commandArr[1])) {
                    cards.add(commandArr[1]);
                    System.out.println("Card successfully added");
                } else {
                    System.out.println("Card is already in the deck");
                }
            } else if (commandArr[0].equals("Remove")) {
                if (cards.contains(commandArr[1])) {
                    cards.remove(commandArr[1]);
                    System.out.println("Card successfully removed");
                } else {
                    System.out.println("Card not found");
                }
            } else if (commandArr[0].equals("Remove At")) {
                int cardIndex = Integer.parseInt(commandArr[1]);
                if (cardIndex >= cards.size() || cardIndex < 0) {
                    System.out.println("Index out of range");
                } else {
                    cards.remove(cardIndex);
                    System.out.println("Card successfully removed");
                }
            } else if (command.contains("Insert")) {
                int cardIndex = Integer.parseInt(commandArr[1]);
                if (cardIndex >= cards.size() || cardIndex < 0) {
                    System.out.println("Index out of range");
                } else {
                    if (!cards.contains(commandArr[2])) {
                        cards.add(cardIndex, commandArr[2]);
                        System.out.println("Card successfully added");
                    } else {
                        System.out.println("Card is already added");
                    }
                }
            }
        }
        System.out.println(cards.toString().replaceAll("[\\[\\]]", ""));
    }
}
