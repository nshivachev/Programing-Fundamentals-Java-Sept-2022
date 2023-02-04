package Fundamentals.ClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

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

        List<Student> studentsList = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+");

            Student currentStudent = new Student();

            currentStudent.setFirstName(commandArr[0]);
            currentStudent.setLastName(commandArr[1]);
            currentStudent.setAge(Integer.parseInt(commandArr[2]));
            currentStudent.setHometown(commandArr[3]);

            studentsList.add(currentStudent);

            command = scanner.nextLine();
        }
        String town = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getHometown().equals(town)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
