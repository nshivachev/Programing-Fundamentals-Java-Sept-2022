package Fundamentals.MapsExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String student = command.split(" : ")[1];

            coursesMap.putIfAbsent(courseName, new ArrayList<>());
            coursesMap.get(courseName).add(student);
            command = scanner.nextLine();
        }

        for (var entry : coursesMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (String student : entry.getValue()) {
                System.out.println("-- " + student);
            }
        }
    }
}
