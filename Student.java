package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // Constructor: prompts user to enter student"s name and year
    public Student(){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter student first name: ");
            this.firstName = in.nextLine();

            System.out.print("Enter student last name: ");
            this.lastName = in.nextLine();

            System.out.print("1- Freshmen\n2- Sophore\n3- Junior\n4- Senior\nEnter student class leve : ");
            this.gradeYear = in.nextLine();
        }
        System.out.println(firstName + " " + lastName + " " + gradeYear);
        


            }

    // Generate an ID
    
}
