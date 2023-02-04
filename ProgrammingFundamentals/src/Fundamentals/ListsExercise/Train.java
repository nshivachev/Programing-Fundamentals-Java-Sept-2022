package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            if (commandArray[0].equals("Add")) {
                wagonsList.add(Integer.parseInt(commandArray[1]));
            } else {
                int passengersToAdd = Integer.parseInt(commandArray[0]);
                for (int i = 0; i < wagonsList.size(); i++) {
                    int currentWagonPassengers = wagonsList.get(i);

                    if (currentWagonPassengers + passengersToAdd <= wagonCapacity) {
                        wagonsList.set(i, currentWagonPassengers + passengersToAdd);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
