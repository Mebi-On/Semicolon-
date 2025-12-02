import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 20;
        while (i < 100) {
            System.out.print("Enter your grade: ");
            int grade_1 = input.nextInt();

            System.out.print("Enter your grade: ");
            int grade_2 = input.nextInt();

            System.out.print("Enter your grade: ");
            int grade_3 = input.nextInt();

            double average_grade = (grade_1 + grade_2 + grade_3) / 3.0;
            System.out.println(average_grade);

            if (90 <= average_grade && average_grade <= 100) {
                System.out.println("A");
            } else if (80 <= average_grade && average_grade < 90) {
                System.out.println("B");
            } else if (70 <= average_grade && average_grade < 80) {
                System.out.println("C");
            } else if (60 <= average_grade && average_grade < 70) {
                System.out.println("D");
            } else if (0 <= average_grade && average_grade < 60) {
                System.out.println("F");
            }
        }
    }
}



