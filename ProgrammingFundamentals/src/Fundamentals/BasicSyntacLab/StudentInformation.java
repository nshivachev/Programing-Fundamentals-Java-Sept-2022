package Fundamentals.BasicSyntacLab;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        float averageGrade = Float.parseFloat(scanner.nextLine());

        String studentInfo = String.format("Name: %s, Age: %d, Grade: %.2f", studentName, age, averageGrade);

        System.out.println(studentInfo);
    }
}
