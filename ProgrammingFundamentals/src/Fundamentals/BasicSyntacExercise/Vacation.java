package Fundamentals.BasicSyntacExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (day.equals("Friday") && type.equals("Students")) {
            price = 8.45;
        } else if (day.equals("Saturday") && type.equals("Students")) {
            price = 9.80;
        } else if (day.equals("Sunday") && type.equals("Students")) {
            price = 10.46;
        } else if (day.equals("Friday") && type.equals("Business")) {
            price = 10.90;
        } else if (day.equals("Saturday") && type.equals("Business")) {
            price = 15.60;
        } else if (day.equals("Sunday") && type.equals("Business")) {
            price = 16;
        } else if (day.equals("Friday") && type.equals("Regular")) {
            price = 15;
        } else if (day.equals("Saturday") && type.equals("Regular")) {
            price = 20;
        } else if (day.equals("Sunday") && type.equals("Regular")) {
            price = 22.50;
        }

        double totalPrice = price * count;

        if (type.equals("Students") && count >= 30) {
            totalPrice = totalPrice - totalPrice * 15 / 100;
        } else if (type.equals("Business") && count >= 100) {
            totalPrice = price * (count - 10);
        } else if (type.equals("Regular") && count >= 10 && count <= 20) {
            totalPrice = totalPrice - totalPrice * 5 / 100;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
