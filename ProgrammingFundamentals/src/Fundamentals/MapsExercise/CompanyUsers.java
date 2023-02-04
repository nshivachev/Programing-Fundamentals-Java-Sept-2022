package Fundamentals.MapsExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];
            companyMap.putIfAbsent(company, new ArrayList<>());
            if (!companyMap.get(company).contains(employeeId)) {
                companyMap.get(company).add(employeeId);
            }
            input = scanner.nextLine();
        }
        for (var entry : companyMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String employee : entry.getValue()) {
                System.out.println("-- " + employee);
            }
        }
    }
}
