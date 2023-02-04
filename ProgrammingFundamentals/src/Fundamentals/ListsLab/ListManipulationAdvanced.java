package Fundamentals.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            if (commandArray[0].equals("Contains")) {
                int firstArrayIndex = Integer.parseInt(commandArray[1]);
                if (numbersList.contains(Integer.valueOf(firstArrayIndex))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }                
            } else if (commandArray[1].equals("even")) {
                for (int number : numbersList) {
                    if (number % 2 == 0) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            } else if (commandArray[1].equals("odd")) {
                for (int number : numbersList) {
                    if (number % 2 != 0) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            } else if (commandArray[0].equals("Get")) {
                int sum = 0;
                for (int number : numbersList) {
                    sum += number;
                }
                System.out.println(sum);
            } else if (commandArray[0].equals("Filter")) {
                int commandNumber = Integer.parseInt(commandArray[2]);
                switch (commandArray[1]) {
                    case "<":
                        for (int number : numbersList) {
                            if (number < commandNumber) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">":
                        for (int number : numbersList) {
                            if (number > commandNumber) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">=":
                        for (int number : numbersList) {
                            if (number >= commandNumber) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case "<=":
                        for (int number : numbersList) {
                            if (number <= commandNumber) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                        break;
                    default:
                        break;
                }
            }
            command = scanner.nextLine();
        }
    }
}
