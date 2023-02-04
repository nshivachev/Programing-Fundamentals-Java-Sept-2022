package Fundamentals.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Integer> resourcesMap = new LinkedHashMap<>();
        int counter = 0;
        String resource = "";

        while (!command.equals("stop")) {
            counter++;
            if (counter % 2 != 0) {
                resource = command;
                resourcesMap.putIfAbsent(resource, 0);
            } else {
                resourcesMap.put(resource, resourcesMap.get(resource) + Integer.parseInt(command));
            }
            command = scanner.nextLine();
        }
        resourcesMap.entrySet().forEach(r -> System.out.println(r.getKey() + " -> " + r.getValue()));
    }
}
