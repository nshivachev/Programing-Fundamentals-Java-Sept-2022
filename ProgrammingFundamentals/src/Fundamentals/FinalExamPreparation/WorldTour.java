package Fundamentals.FinalExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] commandArr = command.split(":");
            if (command.contains("Add Stop")) {
                int index = Integer.parseInt(commandArr[1]);
                String text = commandArr[2];
                if (index >= 0 && index < stops.length()) {
                    StringBuilder currentStops = new StringBuilder(stops);
                    currentStops.insert(index, text);
                    stops = currentStops.toString();
                }
            } else if (command.contains("Remove Stop")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);
                if (startIndex >= 0 && endIndex >= 0 && startIndex < stops.length() && endIndex < stops.length() && startIndex <= endIndex) {
                    StringBuilder currentStops = new StringBuilder(stops);
                    currentStops.delete(startIndex, endIndex + 1);
                    stops = currentStops.toString();
                }
            } else if (command.contains("Switch")) {
                String oldText = commandArr[1];
                String newText = commandArr[2];
                if (stops.contains(oldText)) {
                    stops = stops.replace(oldText, newText);
                }
            }
            System.out.println(stops);
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);
    }
}
