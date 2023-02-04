package Fundamentals.BasicSyntacExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double saberSinglePrice = Double.parseDouble(scanner.nextLine());
        double robeSinglePrice = Double.parseDouble(scanner.nextLine());
        double beltSinglePrice = Double.parseDouble(scanner.nextLine());

        int sabersCount = (int) Math.ceil(studentsCount + (studentsCount * 10.0 / 100));
        double sabersTotalPrice = sabersCount * saberSinglePrice;
        double robesTotalPrice = studentsCount * robeSinglePrice;
        int beltCount = (studentsCount - studentsCount / 6);
        double beltTotalPrice = beltCount * beltSinglePrice;
        double totalPrice = sabersTotalPrice + robesTotalPrice + beltTotalPrice;

        if (budget >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }
    }
}
