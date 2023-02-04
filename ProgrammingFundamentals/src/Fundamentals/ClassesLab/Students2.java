package Fundamentals.ClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students2.Student> studentsList = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+");

            String firstName = commandArr[0];
            String lastName = commandArr[1];
            int age = Integer.parseInt(commandArr[2]);
            String town = commandArr[3];

            Student currentStudent = studentsList
                    .stream()
                    .filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName))
                    .findFirst().orElse(null);

            if (currentStudent == null) {
                Student studentToAdd = new Student(firstName, lastName, age, town);
                studentsList.add(studentToAdd);
            } else {
                currentStudent.setFirstName(firstName);
                currentStudent.setLastName(lastName);
                currentStudent.setAge(age);
                currentStudent.setHometown(town);
            }


            command = scanner.nextLine();
        }
        String town = scanner.nextLine();

        for (Students2.Student student : studentsList) {
            if (student.getHometown().equals(town)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
