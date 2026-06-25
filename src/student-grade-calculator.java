import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = (double) total / n;

        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n----- STUDENT REPORT -----");
        System.out.println("Student Name : " + name);

        System.out.println("Marks Obtained:");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("Total Marks  : " + total);
        System.out.printf("Average      : %.2f\n", average);
        System.out.println("Grade        : " + grade);

        if (grade.equals("Fail")) {
            System.out.println("Result       : Better Luck Next Time");
        } else {
            System.out.println("Result       : Pass");
        }

        sc.close();
    }
}