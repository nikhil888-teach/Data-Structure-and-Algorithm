package OOP.STATIC;


import java.util.Scanner;

/*
* 1. Create a class Student that contains following data members
● static variable to create unique number
● A variable to store roll no
● A variable to store name
● An array to store marks of 5 subjects
● static field totalMarks
This class should have the following member functions:
A constructor with no-parameters that increments static variable and assign it to roll
number. Remaining data members should be initialized to zero or empty values.
Input() function to input name and marks of 5 subjects from user
Show() function to display roll number, name and marks of 5 subjects to the user
TotalStudents() function that should display the number of objects that has been
created so far. This function should be static.
TotalMarks() function that should calculate and return to total marks of a student
getHighest() function that returns highest marks of the student
getLowest() function that returns lowest marks of the student
getAverage() function that returns average marks of student
getPassCount() function that counts and returns total number of subjects in which the
student is passed. (A student is passed if he gets 50% or above marks)
In main function, create three objects, input their values and display them. For each
student, display his total marks, highest, lowest, average marks and the number of
subjects in which he is passed. Also display how many students have been registered so
far.
* */
class Student {
    static int index;
    static int pass, fail;
    private final int rollNO;
    private final int[] mark;
    Scanner sc = new Scanner(System.in);
    private String name;
    private int totalMarks;

    Student() {
        index++;
        rollNO = index;
        mark = new int[5];

    }

    static int totalStudent() {
        return index;
    }

    public static int getFail() {
        return fail;
    }

    public static int getPass() {
        return pass;
    }

    int getAverage() {
        return totalMarks / 5;
    }

    int getLowest() {
        int low = mark[0];
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] < low) {
                low = mark[i];
            }
        }
        return low;
    }

    int getHighest() {
        int high = 0;
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] > high) {
                high = mark[i];
            }
        }
        return high;
    }

    void show() {
        System.out.println("Roll :- " + rollNO);
        System.out.println("Name :- " + name);
        for (int i = 0; i < mark.length; i++) {
            System.out.println((i + 1) + " Sub Mark :- " + mark[i]);
        }
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   ");

    }

    int setTotalMarks() {
        for (int i = 0; i < mark.length; i++) {
            totalMarks += mark[i];
        }
        return totalMarks;
    }

    void input() {
        System.out.println("Enter Name :- ");
        name = sc.nextLine();
        for (int i = 0; i < mark.length; i++) {
            System.out.print("Enter  " + (i + 1) + " Subject Mark :- ");
            mark[i] = sc.nextInt();
        }
        setTotalMarks();
        if (((totalMarks / 5)) >= 50) {
            pass++;
        } else {
            fail++;
        }
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   ");
    }
}

public class StudentDetail {
    public static void main(String[] args) {
        Student[] s1 = new Student[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new Student();
            s1[i].input();
        }
        for (int i = 0; i < s1.length; i++) {
            s1[i].show();
        }
        int choice = 1;
        while (choice != 0) {
            System.out.println("--------------------------------------------");
            System.out.println("Total Student :- " + Student.totalStudent());
            System.out.println("Total Pass Student :- " + Student.getPass());
            System.out.println("Total Fail Student :- " + Student.getFail());
            System.out.println("--------------------------------------------");
            System.out.println("Your Operations :- ");
            System.out.println("0.Exit");
            System.out.println("1.show");
            System.out.println("2.Highest Mark");
            System.out.println("3.lowest Mark");
            System.out.println("4.Avg Mark");
            System.out.println("Enter Choice :- ");
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            System.out.println("Select Student roll No :- ");
            int selectStudent = sc.nextInt();
            if (selectStudent > 0 && selectStudent < 4) {
                selectStudent--;
                switch (choice) {
                    case 1:
                        s1[selectStudent].show();
                        break;
                    case 2:
                        System.out.println("HighestMark :- " + s1[selectStudent].getHighest());
                        break;
                    case 3:
                        System.out.println("Lowest :- " + s1[selectStudent].getLowest());
                        break;
                    case 4:
                        System.out.println("Average :- " + s1[selectStudent].getAverage());
                        break;
                    default:
                        System.out.println("Invalid choice....try again");
                        break;
                }
            } else {
                System.out.println("Student Not Found");
            }
        }

    }
}
