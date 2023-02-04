package Fundamentals.FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String location = scanner.nextLine();

        Pattern pattern = Pattern.compile("(=|\\/)(?<location>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(location);

        List<String> destinationsList = new ArrayList<>();

        int travelPoints = 0;
        while (matcher.find()) {
            destinationsList.add(matcher.group("location"));
            travelPoints += matcher.group("location").length();
        }

        System.out.println("Destinations: " + String.join(", ", destinationsList));
        System.out.println("Travel Points: " + travelPoints);
    }
}
