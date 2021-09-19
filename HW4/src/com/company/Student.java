package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Cloneable{

    /**
     * Private variables
     */
    private String fN;
    private String lN;
    private String fullName;
    public ArrayList<Integer> grades = new ArrayList<>();
    private double average;
    private double sum;

    /**
     * public setter to set a students first name
     * @param firstName students first name
     */
    public void setFirstName(String firstName) {
        fN = firstName;
    }

    /**
     * public setter to set a students last name
     * @param lastName students last name
     */
    public void setLastName(String lastName) {
        lN = lastName;
    }

    /**
     * public setter to set all students test grades
     * @param grade test grade to add to array list
     */
    public void addTest(int grade) {
            grades.add(grade);
    }

    /**
     *  Allows user to change an existing grade in a list
     * @param index index that we want to change
     * @param grade the new grade we want to enter
     */
    public void editTest(int index, int grade){
        grades.set(index, grade);
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

    public String getFirstName(){
        return fN;
    }

    public String getLastName(){
        return lN;
    }
    /**
     * public getter to retrieve student average
     * @return students average by adding grades
     * then dividing by size of array list
     */
    public void setAverage(){
       for(int i = 0; i <(getTestCount()); i++){
           sum += grades.get(i);
       }
       average = sum/grades.size();

    }

    public double getAverage(){
        return average;
    }

    public void clearAverageCaluclations(){
        average = 0;
        sum = 0;
    }
    /**
     * public getter to return amount of tests taken
     * @return test count by calcualting size of
     * array list
     */
    public int getTestCount(){
        int testCount = grades.size();
        return testCount;
    }

    /**
     * Custom Constructor
     *
     * @param firstName student first name
     * @param lastName  student last name
     */

    public Student(String firstName, String lastName) {
        fN = firstName;
        lN =lastName;
    }

    /**
     * Default constructor
     */
    public Student() {

    }

    public Object clone() throws CloneNotSupportedException{
        return (Student) super.clone();
    }
}
