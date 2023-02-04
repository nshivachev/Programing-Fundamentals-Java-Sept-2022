package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            if (commandArray[0].equals("Delete")) {
                numbersList.removeAll(Arrays.asList(Integer.parseInt(commandArray[1])));
            } else {
                numbersList.add(Integer.parseInt(commandArray[2]), Integer.parseInt(commandArray[1]));
            }
            command = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
