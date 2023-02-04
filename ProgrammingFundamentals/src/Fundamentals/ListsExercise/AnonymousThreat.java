package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Math.max(0, Integer.parseInt(command.split(" ")[1]));
                int endIndex = Math.max(0, Integer.parseInt(command.split(" ")[2]));
                startIndex = Math.min(inputList.size() - 1, startIndex);
                endIndex = Math.min(inputList.size() - 1, endIndex);

                if (startIndex < endIndex) {
                    String elementToMerge = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        elementToMerge += inputList.get(i);
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        inputList.remove(startIndex);
                    }
                    inputList.add(startIndex, elementToMerge);
                }
            } else {
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);
                String elementToDivide = inputList.get(index);

                inputList.remove(index);

                int startIndex = 0;
                int endIndex;
                int indexesToExtend = elementToDivide.length() / partitions;
                for (int i = 1; i < partitions; i++) {
                    endIndex = startIndex + indexesToExtend;
                    inputList.add(index, elementToDivide.substring(startIndex, endIndex));
                    startIndex = endIndex;
                    index++;
                }
                inputList.add(index, elementToDivide.substring(startIndex));
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", inputList));
    }
}