package StudentGradeCalculator;

import java.util.Scanner;

//Show the total marks, average percentage, and the corresponding grade.
public class SGCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your total Subjects : ");
        int size = sc.nextInt();
        System.out.print("Enter the value of subject : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int TM = total_marks(arr);
        double AM = Avg_Per(TM, size);
        String GD = Grades(AM);
        System.out.println("Total Marks are : " + TM);
        System.out.println("Average of the Marks are : " + AM);
        System.out.println("Grades are : "+GD);

    }
    // Calculate Total marks
    public static int total_marks(int sumArr[]) {
        int sum = 0;
        for (int i = 0; i < sumArr.length; i++) {
            sum += sumArr[i];
        }
        return sum;
    }
    //Calculate Average of marks
    public static double Avg_Per(int Avg, int size) {
        return (double) (Avg / size);
    }
    //Assign Grades
    public static String Grades(double marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

}