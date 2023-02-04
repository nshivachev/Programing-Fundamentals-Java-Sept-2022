package Fundamentals.MapsExercise;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] commandArr = scanner.nextLine().split("\\s+");
            String command = commandArr[0];
            String userName = commandArr[1];

            if (command.equals("register")) {
                String license = commandArr[2];
                if (!parkingMap.containsKey(userName)) {
                    parkingMap.put(userName, license);
                    System.out.printf("%s registered %s successfully%n", userName, license);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", parkingMap.get(userName));
                }
            } else {
                if (parkingMap.containsKey(userName)) {
                    parkingMap.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                } else {
                    System.out.printf("ERROR: user %s not found%n", userName);
                }
            }
        }
        parkingMap.entrySet().forEach(p -> System.out.println(p.getKey() + " => " + p.getValue()));
    }
}
