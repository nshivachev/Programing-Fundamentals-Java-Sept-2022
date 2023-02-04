package Fundamentals.MapsExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentMap.putIfAbsent(name, new ArrayList<>());
            studentMap.get(name).add(grade);
        }

        for (var entry : studentMap.entrySet()) {
            double currentGrade = 0.0;
            for (double grade : entry.getValue()) {
                currentGrade += grade;
            }
            currentGrade = currentGrade / entry.getValue().size();
            if (currentGrade >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), currentGrade);
            }
        }
    }
}
