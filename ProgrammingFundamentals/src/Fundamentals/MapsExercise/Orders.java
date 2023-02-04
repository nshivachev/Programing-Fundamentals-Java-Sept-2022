package Fundamentals.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double>  productPriceMap = new LinkedHashMap<>();
        Map<String, Integer>  productQuantityMap = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("buy")) {
            String name = command.split("\\s+")[0];
            double price = Double.parseDouble(command.split("\\s+")[1]);
            int quantity = Integer.parseInt(command.split("\\s+")[2]);

            productPriceMap.put(name, price);
            productQuantityMap.putIfAbsent(name, 0);
            productQuantityMap.put(name, productQuantityMap.get(name) + quantity);
            productPriceMap.put(name, productPriceMap.get(name) * productQuantityMap.get(name));

            command = scanner.nextLine();
        }
        productPriceMap.entrySet().forEach(p -> System.out.printf("%s -> %.2f%n", p.getKey(), p.getValue()));
    }
}
