package Fundamentals.ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            //List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String[] commandArray = command.split(" ");
            //String guestName = commandList.get(0);
            String guestName = commandArray[0];
            if (command.contains("not")) {
                if (guestsList.contains(guestName)) {
                    guestsList.remove(guestName);
                } else {
                    System.out.printf("%s is not in the list!%n", guestName);
                }
            } else {
                if (!guestsList.contains(guestName)) {
                    guestsList.add(guestName);
                } else {
                    System.out.printf("%s is already in the list!%n", guestName);
                }
            }
        }
        for (String guest : guestsList) {
            System.out.println(guest);
        }
    }
}
