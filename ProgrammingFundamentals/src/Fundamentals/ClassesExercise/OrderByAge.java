package Fundamentals.ClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person {
        private String name;
        private String id;
        private int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String name = command.split("\\s+")[0];
            String id = command.split("\\s+")[1];
            int age = Integer.parseInt(command.split("\\s+")[2]);

            Person person = new Person(name, id, age);
            peopleList.add(person);
            command = scanner.nextLine();
        }
        peopleList.sort(Comparator.comparingDouble(Person::getAge));
        for (Person person : peopleList) {
            System.out.println(person);
        }
    }
}
