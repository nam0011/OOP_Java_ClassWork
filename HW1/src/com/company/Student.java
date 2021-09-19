//package com.company;

public class Student{

    /**
     * Private variables
     */
    private String fN;
    private String lN;
    private int g1;
    private int g2;
    private int g3;


    /**
     * public setter to set a students first name
     * @param firstName students first name
     */
    public void setFirstName(String firstName) {
        fN = firstName;
    }

    /**
     * public setter to set all students test grades
     * @param grade1    test one grade
     * @param grade2    test two grade
     * @param grade3    test three grade
     */
    public void setTestGrades(int grade1, int grade2, int grade3) {
        g1 = grade1;
        g2 = grade2;
        g3 = grade3;
    }

    /**
     * public getter to retrieve students full name
     * @return  full name of student displayed propely by adding a space
     * between first and last name
     */
    public String getFullName() {
        String fullName = fN + " " + lN;
        return fullName;
    }

    /**
     * public getter to retrieve student average
     * @return students average by computing grades
     */
    public int getAverage(){

        int average = (g1 + g2 + g3) / 3;

        return average;
    }

    /**
     * Constructs a Student object that computes name and test average
     * @param firstName first name of student
     * @param lastName  last name of student
     * @param grade1    first test grade
     * @param grade2    second test grade
     * @param grade3    third test grade
     */
    public Student(String firstName, String lastName, int grade1, int grade2, int grade3) {
        fN = firstName;
        lN = lastName;
        g1 = grade1;
        g2 = grade2;
        g3 = grade3;
    }

    /**
     * Default constructor (not used but included if end user decided to remove custom)
     */
    public Student() {

    }


}
