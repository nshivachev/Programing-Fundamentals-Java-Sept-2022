package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> scheduleList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] commandArray = command.split(":");
            switch (commandArray[0]) {
                case "Add":
                    String lessonToAdd = commandArray[1];
                    if (!scheduleList.contains(lessonToAdd)) {
                        scheduleList.add(lessonToAdd);
                    }
                    break;
                case "Insert":
                    String lessonToInsert = commandArray[1];
                    int index = Integer.parseInt(commandArray[2]);
                    if (!scheduleList.contains(lessonToInsert)) {
                        scheduleList.add(index, lessonToInsert);
                    }
                    break;
                case "Remove":
                    String lessonToRemove = commandArray[1];
                    String exerciseToRemove = lessonToRemove + "-Exercise";
                    if (scheduleList.contains(lessonToRemove)) {
                        if (scheduleList.contains(exerciseToRemove)) {
                            scheduleList.remove(exerciseToRemove);
                        }
                        scheduleList.remove(lessonToRemove);
                    }
                    break;
                case "Swap":
                    String firstLesson = commandArray[1];
                    String secondLesson = commandArray[2];
                    String firstExercise = firstLesson + "-Exercise";
                    String secondExercise = secondLesson + "-Exercise";
                    if (scheduleList.contains(firstLesson) && scheduleList.contains(secondLesson)) {
                        int firstLessonIndex = scheduleList.indexOf(firstLesson);
                        int secondLessonIndex = scheduleList.indexOf(secondLesson);

                        scheduleList.set(firstLessonIndex, secondLesson);
                        scheduleList.set(secondLessonIndex, firstLesson);

                        if (scheduleList.contains(firstExercise)) {
                            scheduleList.remove(firstExercise);
                            scheduleList.add(scheduleList.indexOf(firstLesson) + 1, firstExercise);
                        }
                        if (scheduleList.contains(secondExercise)) {
                            scheduleList.remove(secondExercise);
                            scheduleList.add(scheduleList.indexOf(secondLesson) + 1, secondExercise);
                        }
                    }
                    break;
                case "Exercise":
                    String lessonTitle = commandArray[1];
                    String exerciseTitle = lessonTitle + "-Exercise";
                    if (scheduleList.contains(lessonTitle)) {
                        if (!scheduleList.contains(exerciseTitle)) {
                            scheduleList.add(scheduleList.indexOf(lessonTitle) + 1, exerciseTitle);
                        }
                    } else {
                        scheduleList.add(lessonTitle);
                        scheduleList.add(exerciseTitle);
                    }
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < scheduleList.size(); i++) {
            System.out.println(i + 1 + "." + scheduleList.get(i));
        }
    }
}
