package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendsList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int blacklistedNames = 0;
        int lostNames = 0;

        while (!command.equals("Report")) {
            String[] commandArr = command.split("\\s+");
            if (command.contains("Blacklist")) {
                if (friendsList.contains(commandArr[1])) {
                    friendsList.set(friendsList.indexOf(commandArr[1]), "Blacklisted");
                    System.out.println(commandArr[1] + " was blacklisted.");
                    blacklistedNames++;
                } else {
                    System.out.println(commandArr[1] + " was not found.");
                }
            } else if (command.contains("Error")) {
                int index = Integer.parseInt(commandArr[1]);
                if (index >= 0 && index < friendsList.size()) {
                    if (!friendsList.get(index).equals("Blacklisted") && !friendsList.get(index).equals("Lost")) {
                        System.out.println(friendsList.get(index) + " was lost due to an error.");
                        friendsList.set(index, "Lost");
                        lostNames++;
                    }
                }
            } else if (command.contains("Change")) {
                int index = Integer.parseInt(commandArr[1]);
                if (index >= 0 && index < friendsList.size()) {
                    System.out.printf("%s changed his username to %s.%n", friendsList.get(index), commandArr[2]);
                    friendsList.set(index, commandArr[2]);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Blacklisted names: " + blacklistedNames);
        System.out.println("Lost names: " + lostNames);
        System.out.println(friendsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
