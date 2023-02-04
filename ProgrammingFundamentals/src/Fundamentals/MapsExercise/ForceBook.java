package Fundamentals.MapsExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Lumpawaroo")) {
            boolean isUserExist = false;
            if (input.contains("|")) {
                String side = input.split(" \\| ")[0];
                String user = input.split(" \\| ")[1];
                forceMap.putIfAbsent(side, new ArrayList<>());
                for (var entry : forceMap.entrySet()) {
                    if (entry.getValue().contains(user)) {
                        isUserExist = true;
                        break;
                    }
                }
                if (!isUserExist) {
                    forceMap.get(side).add(user);
                }
            } else {
                String side = input.split(" -> ")[1];
                String user = input.split(" -> ")[0];
                forceMap.putIfAbsent(side, new ArrayList<>());
                forceMap.entrySet().forEach(entry -> entry.getValue().remove(user));
                forceMap.get(side).add(user);
                System.out.printf("%s joins the %s side!%n", user, side);
            }
            input = scanner.nextLine();
        }

        forceMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                            entry.getValue().forEach(user -> System.out.println("! " + user));
                        }
                );
    }
}
