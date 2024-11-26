package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompts user to enter student"s name and year
    public Student(){
        Scanner in = new Scanner(System.in);
            System.out.print("Enter student first name: ");
            this.firstName = in.nextLine();

            System.out.print("Enter student last name: ");
            this.lastName = in.nextLine();

            System.out.print("1- Freshmen\n2- Sophore\n3- Junior\n4- Senior\nEnter student class level : ");
            this.gradeYear = in.nextLine();
            
            setStudentID();
        }

    // Generate an ID
    private void setStudentID(){
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }
    //Enroll in Course
    public void enroll(){
        //Get inside a Loop, user hits 0
           do { 
            System.out.print("Enter course to enroll (Q to Quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
                }
                else {
                    System.out.println("BREAK");
                    break;
                }
           } while(1 != 0);
    }
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is $" + tuitionBalance + "\n");
    }
    // Pay tution
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment + "\n");
        viewBalance();
    }
    // Show status
    public String toString(){
        return "Name: " + firstName + " " + lastName +
        "\nGrade Level: " + gradeYear +
        "\nStudent ID: " + studentID +
        "\nCourses Enrolled:" + courses +
        "\nBalance: $" + tuitionBalance + "\n";
    }
    
}
