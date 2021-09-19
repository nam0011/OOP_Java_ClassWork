package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner usrIn = new Scanner(System.in);
        System.out.print("Enter a student's data on a single line and press return: ");

        Student student1 = new Student();
        String input = usrIn.nextLine();
        String[] splitInput = input.split(" ");

        //probably(*definitely*) not the best way to do this but it does work
        student1.setFirstName(splitInput[0]);
        student1.setLastName(splitInput[1]);
        for(int i = 2; i<splitInput.length;i++) {
            student1.addTest(Integer.parseInt(splitInput[i]));
        }

        System.out.println("The student you entered: ");
        System.out.println(student1.getFullName()+" has "+ student1.getTestCount()+" grades and an average of "+ student1.getAverage());
    }
}
