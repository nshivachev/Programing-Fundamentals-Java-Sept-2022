package Fundamentals.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            int firstArrayIndex = Integer.parseInt(commandArray[1]);
            switch (commandArray[0]) {
                case "Add":
                    numbersList.add(firstArrayIndex);
                    break;
                case "Remove":
                    numbersList.remove(Integer.valueOf(firstArrayIndex));
                    break;
                case "RemoveAt":
                    numbersList.remove(firstArrayIndex);
                    break;
                case "Insert":
                    numbersList.add(Integer.parseInt(commandArray[2]), firstArrayIndex);
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
