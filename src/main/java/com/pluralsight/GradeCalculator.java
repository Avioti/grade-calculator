package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:  ");
        String name = scanner.nextLine();

        System.out.println("Enter first test score:  ");
        int Test_one = scanner.nextInt();


        System.out.println("Enter second test score:  ");
        int Test_two = scanner.nextInt();

        System.out.println("Enter First Quiz score:  ");
        int Quiz_one = scanner.nextInt();

        System.out.println("Enter Second Quiz score:  ");
        int Quiz_two = scanner.nextInt();

        System.out.println("Enter Third Quiz score:  ");
        int Quiz_three = scanner.nextInt();

        System.out.println("Enter First Homework score:  ");
        int Homework_one = scanner.nextInt();

        System.out.println("Enter Second Homework score:  ");
        int Homework_two = scanner.nextInt();

        System.out.println("Enter Third Homework score:  ");
        int Homework_three = scanner.nextInt();

        System.out.println("Enter Fourth Homework score:  ");
        int Homework_four = scanner.nextInt();

        int Test_average = (Test_one + Test_two) / 2;
        int Quiz_average = (Quiz_one + Quiz_two + Quiz_three) / 3;
        int Homework_average = (Homework_one + Homework_two + Homework_three + Homework_four) / 4;
        double Final_grade = (Test_average * 0.4) + (Quiz_average * 0.3) + (Homework_average * 0.3);

        System.out.println("Test Average: " + Test_average);
        System.out.println("Quiz Average: " + Quiz_average);
        System.out.println("Homework Average: " + Homework_average);
        System.out.printf("Final Grade: %.2f%n" ,Final_grade);
        if (Test_average >= 90){
            System.out.println("Your Overall Test grade is A");
        }
        else if (Test_average >= 80) {
            System.out.println("Your Overall Test grade is B");
        }
        else if (Test_average >= 70) {
            System.out.println("Your Overall Test grade is C");
        }
        else if (Test_average >= 60) {
            System.out.println("Your Overall Test grade is D");
        }
        else {
            System.out.println("Your Overall Test grade is F");
        }

        if (Quiz_average >= 90){
            System.out.println("Your Overall Quiz grade is A");
        }
        else if (Quiz_average >= 80) {
            System.out.println("Your Overall Quiz grade is B");


        }
        else if (Quiz_average >= 70) {
            System.out.println("Your Overall Quiz grade is C");


        }
        else if (Quiz_average >= 60) {
            System.out.println("Your Overall Quiz grade is D");


        }
        else {
            System.out.println("Your Overall Quiz grade is F");


        }

        if (Homework_average >= 90){
            System.out.println("Your Overall Homework grade is A");
        }
        else if (Homework_average >= 80) {
            System.out.println("Your Overall Homework grade is B");
        }
        else if (Homework_average >= 70) {
            System.out.println("Your Overall Homework grade is C");
        }
        else if (Homework_average >= 60) {
            System.out.println("Your Overall Homework grade is D");
        }
        else {
            System.out.println("Your Overall Homework grade is F");
        }


    }
}
