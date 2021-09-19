import java.io.*;
import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        System.out.println("Enter File Path to Open: ");
        Scanner usrIn = new Scanner(System.in);
        String fileName = usrIn.nextLine();

        ArrayList<Student> studentList = new ArrayList<Student>();

        FileReader inFile = new FileReader (fileName);

        try{
            inFile = new FileReader(fileName);
        }catch(FileNotFoundException e){
            System.err.println("File not located");
            return;
        }
        System.out.println("File Opened");

        Scanner fileRead = new Scanner(inFile);
        Student thisStudent = new Student();

        while(fileRead.hasNext()){
            String firstName = fileRead.next();
            String lastName = fileRead.next();

            thisStudent = new Student(firstName, lastName);
            while(fileRead.hasNextInt()){
                thisStudent.addTest(fileRead.nextInt());
            }

            studentList.add(thisStudent);
        }
        for(Student i: studentList){
            i.setAverage();
        }

        System.out.println();
        System.out.println();


        studentList.sort(Student::compareName);
        for(Student i: studentList){
            System.out.println(i.getFullName()+" has "+i.getTestCount()+" with average of "+i.getAverage());    //printing original values out all at once to show testCount and average original values
        }

        System.out.println();
        System.out.println();

        studentList.sort(Student::compareAverage);
        for(Student i: studentList){
            System.out.println(i.getFullName()+" has "+i.getTestCount()+" with average of "+i.getAverage());    //printing original values out all at once to show testCount and average original values
        }

/*
        Student studentCopy;        //making a new object of type student to hold copy values
        studentCopy = new Student();
        ArrayList<Student> studentCopyList = new ArrayList<Student>();  //new array list to hold all the copies

        for (Student i : studentList) {         //copying all of the students into the list of copies
            studentCopy = (Student)i.clone();
            studentCopy.grades = (ArrayList<Integer>) i.grades.clone(); //must use this to clone every array list even if cloning entire object
            studentCopyList.add(studentCopy);
        }
        for(int i = 0; i< studentList.size(); i++) {
            studentCopyList.get(i).setFirstName("hello");   //accessing a member of the copied list and setting a new first name value
            studentCopyList.get(i).editTest(0, 20);   //accessing a member of the copied list and setting a new grade value
            System.out.println(studentCopyList.get(i).getFirstName());   //printing the edited name value
            System.out.println(studentCopyList.get(i).grades.get(0));   //printing the edited grade value
            System.out.println(studentList.get(i).getFirstName());   //showing that name from original does not change (immutable value)
            System.out.println(studentList.get(i).grades.get(0));   //showing that grade from original does not change  (mutable value)
            studentCopyList.get(i).addTest(80); //add a grade to every student
        }
        System.out.println();       //skipping line
        for(int i = 0; i < studentCopyList.size(); i++) {
            System.out.println(studentCopyList.get(i).getFullName());   //print new student name
            for (int j = 0; j < studentCopyList.get(i).getTestCount(); j++) {
                System.out.println(studentCopyList.get(i).grades.get(j));   //print altered grade list
            }
            System.out.println();
        }

        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i).getFullName());   //print old student name
            for(int j = 0 ; j < studentList.get(i).getTestCount(); j++){
                System.out.println(studentList.get(i).grades.get(j));   //print original grade list
            }
            System.out.println();
        }

        for(Student i: studentCopyList){
            i.clearAverageCaluclations();   //clearing out old values
            i.setAverage(); //setting new values
            System.out.println(i.getFullName()+" has "+i.getTestCount()+" with average of "+i.getAverage());    //printing to show new values
        }

        for(Student i: studentList){
            System.out.println(i.getFullName()+" has "+i.getTestCount()+" with average of "+i.getAverage());    //printing original values out all at once to show testCount and average original values
        }

        //hence mutable and immutable values within Student object are able to be cloned without editing original values
*/
    }//end of main argument
}//end of Class Main
