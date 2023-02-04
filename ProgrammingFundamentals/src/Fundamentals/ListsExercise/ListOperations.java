package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArray = command.split(" ");
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(commandArray[1]);
                numbersList.add(numberToAdd);
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(commandArray[2]);
                int numberToAdd = Integer.parseInt(commandArray[1]);
                if (isValidIndex(index, numbersList)) {
                    numbersList.add(index, numberToAdd);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int index = Integer.parseInt(commandArray[1]);
                if (isValidIndex(index, numbersList)) {
                    numbersList.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("left")) {
                int countTimes = Integer.parseInt(commandArray[2]);
                for (int i = 1; i <= countTimes; i++) {
                    int firstListElement = numbersList.get(0);
                    numbersList.add(firstListElement);
                    numbersList.remove(0);
                }
            } else if (command.contains("right")) {
                int countTimes = Integer.parseInt(commandArray[2]);
                for (int i = 1; i <= countTimes; i++) {
                    int lastListElement = numbersList.get(numbersList.size() - 1);
                    numbersList.add(0, lastListElement);
                    numbersList.remove(numbersList.size() - 1);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
    public static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index < numbers.size();
    }
}
