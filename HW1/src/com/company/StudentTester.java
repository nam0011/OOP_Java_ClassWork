package com.company;

public class StudentTester {

    public static void main(String[] args) {

            Student student1 = new Student("Beth", "Allen", 100, 100, 100); // fill with constructor
            Student student2 = new Student(); // will be filled with set methods
            student2.setFirstName("Bob");
            student2.setTestGrades(80,85,82);
            System.out.println("Program 1 - uses hardcoded statements to set a student's data.");
            System.out.println("The two Student's names and averages are: ");
            System.out.println(student1.getFullName() + ": " + student1.getAverage());
            System.out.println(student2.getFullName() + ": " + student2.getAverage());

    }//end of main

}//end of Student Tester
