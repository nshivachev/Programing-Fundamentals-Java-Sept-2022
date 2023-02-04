package Fundamentals.ClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int power;

        public Vehicle(String type, String model, String color, int power) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.power = power;
        }

        public String getType() {
            return this.type;
        }

        public String getModel() {
            return this.model;
        }

        public int getPower() {
            return this.power;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", this.type, this.model, this.color, this.power);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        int carPower = 0;
        int truckPower = 0;
        int carsCount = 0;
        int trucksCount = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputArr = input.split("\\s+");
            if (inputArr[0].equals("car")) {
                Vehicle vehicle = new Vehicle("Car", inputArr[1], inputArr[2], Integer.parseInt(inputArr[3]));
                vehicleList.add(vehicle);
                carPower += Integer.parseInt(inputArr[3]);
                carsCount++;
            } else {
                Vehicle vehicle = new Vehicle("Truck", inputArr[1], inputArr[2], Integer.parseInt(inputArr[3]));
                vehicleList.add(vehicle);
                truckPower += Integer.parseInt(inputArr[3]);
                trucksCount++;
            }
            input = scanner.nextLine();
        }

        String model = scanner.nextLine();

        while (!model.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }
        if (carsCount > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", 1.0 * carPower / carsCount);
        } else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }
        if (trucksCount > 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", 1.0 * truckPower / trucksCount);
        } else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }
    }
}
