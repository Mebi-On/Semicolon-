import java.util.Scanner;

public class ScoreEval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first score: ");
        int score1 = input.nextInt();
        System.out.print("Enter second score: ");
        int score2 = input.nextInt();
        System.out.print("Enter third score: ");
        int score3 = input.nextInt();
        System.out.print("Enter fourth score: ");
        int score4 = input.nextInt();
        System.out.print("Enter fifth score: ");
        int score5 = input.nextInt();

        int total = score1 + score2 + score3 + score4 + score5;
        double average = total / 5.0;

        if (average >= 70) {
            System.out.println("Excelent");
        } else if (70 > average && average >= 60) {
            System.out.println("Very Good");
        } else if (60 > average && average >= 45) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }

    }
}