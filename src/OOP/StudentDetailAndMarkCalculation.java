package OOP;


/*Write a program which creates a class Student with the following Data Members
rollNum, studName, mark1, mark2, mark3, totalMarks
Methods
setStudDetails() – which sets the values to all the data members except
totalMarks.
calculateTotal() - which calculate the totalMarks
displayStudDetails() – which displays rollNum, studName and totalMarks
Create a class StudentDemo to test the functionality of Student class*/


import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int mark[];
    int total;
    Scanner sc = new Scanner(System.in);

    Student() {
        mark = new int[3];
        total = 0;
    }

    void setStudentDetail() {
        System.out.println("Enter Name :- ");
        name = sc.nextLine();
        System.out.println("Enter Roll No :- ");
        rollno = sc.nextInt();
        for (int i = 0; i < mark.length; i++) {
            System.out.print("Enter " + (i + 1) + " sub mark :- ");
            mark[i] = sc.nextInt();
        }
        calculateTotal();
    }

    void calculateTotal() {
        for (int i = 0; i < mark.length; i++) {
            total += mark[i];
        }
        displayDetail();
    }

    void displayDetail() {
        System.out.println("Roll no :- " + rollno);
        System.out.println("Name :- " + name);
        for (int i = 0; i < mark.length; i++) {
            System.out.println((i + 1) + " sub mark :- " + mark[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("Total Mark :- " + total);
    }

    void exchange(Student s) {
        rollno = s.rollno;
        name = s.name;
        for (int i = 0; i < mark.length; i++) {
            mark[i] = s.mark[i];
        }
        total = s.total;
    }


}

public class StudentDetailAndMarkCalculation {
    public static void main(String[] args) {
        Student[] s1 = new Student[5];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new Student();
            s1[i].setStudentDetail();

        }
        for (int i = 0; i < s1.length - 1; i++) {
            for (int j = 0; j < s1.length - 1; j++) {
                if (s1[j].total < s1[j + 1].total) {
                    Student s2 = new Student();
                    s2.exchange(s1[j]);
                    s1[j].exchange(s1[j + 1]);
                    s1[j + 1].exchange(s2);
                }
            }
        }
        System.out.println("------------ sort -------------");

        for (int i = 0; i < 3; i++) {
            s1[i].displayDetail();
        }
    }

}
