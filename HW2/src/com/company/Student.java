package com.company;

import java.util.ArrayList;

public class Student{

    /**
     * Private variables
     */
    private String fN;
    private String lN;
    private String fullName;
    private ArrayList<Integer> grades= new ArrayList<Integer>();
    private int average;
    private int sum;


    /**
     * public setter to set a students first name
     * @param firstName students first name
     */
    public void setFirstName(String firstName) {

        fN = firstName;
    }

    /**
     * public setter to set all students test grades
     * @param grade    test grade to add to array list
     */
    public void addTest(int grade) {

        grades.add(grade);
    }

    /**
     * public getter to retrieve students full name
     * @return  full name of student displayed propely by adding a space
     * between first and last name
     * if no first or last name corrects so "null" is not displayed to screen
     */
    public String getFullName() {
        if(!(lN == null) && !(fN == null)){
            fullName = fN + " " + lN;
        }else if(lN == null){
            fullName = fN;
        }else{
            fullName = lN;
        }
        return fullName;
    }

    /**
     * public getter to retrieve student average
     * @return students average by adding grades
     * then dividing by size of array list
     */
    public int getAverage(){
       for(int i = 0; i <(grades.size()); i++){
           sum += grades.get(i);
        }
        average = sum/grades.size();
       return average;
    }

    /**
     * public getter to return amount of tests taken
     * @return test count by calcualting size of
     * array list
     */
    public int getTestCount(){
        int testCount =grades.size();
        return testCount;
    }

    /**
     * Constructs a Student object that stores name
     * @param firstName first name of student
     * @param lastName  last name of student
     */
    public Student(String firstName, String lastName) {
        fN = firstName;
        lN = lastName;

    }

    /**
     * Default constructor
     */
    public Student() {

    }


}
