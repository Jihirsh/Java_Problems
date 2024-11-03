import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter 1st number: ");
        double marks1 = sc.nextDouble();
        while ( marks1 < 0 || marks1 > 100) {
            System.out.println("please enter within range");
            marks1 = sc.nextDouble();
        }


        System.out.println("Enter 2nd number: ");
        double marks2 = sc.nextDouble();
        while (marks2 < 0 || marks2 > 100) {
            System.out.println("please enter within range");
            marks2 = sc.nextDouble();
        }


        System.out.println("Enter 3rd number: ");
        double marks3 = sc.nextDouble();
        while (marks3 < 0 || marks3 > 100) {
            System.out.println("please enter within range");
            marks3 = sc.nextDouble();
        }


        System.out.println("Enter 4th number: ");
        double marks4 = sc.nextDouble();
        while (marks4 < 0 || marks4 > 100) {
            System.out.println("please enter within range");
            marks4 = sc.nextDouble();
        }


        System.out.println("Enter 5th number: ");
        double marks5 = sc.nextDouble();
        while (marks5 < 0 || marks5 > 100) {
            System.out.println("please enter within range");
            marks5 = sc.nextDouble();
        }

        double totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = totalMarks / 5;
        System.out.println("Your percentage is: " + percentage);
    }
}


