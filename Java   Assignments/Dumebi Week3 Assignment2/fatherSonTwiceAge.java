import java.util.Scanner;

public class fatherSonTwiceAge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
            System.out.print("Enter the fahters current age: ");
            int fathers_age = input.nextInt();

            System.out.print("Enter the sons currnet age: ");
            int sons_age = input.nextInt();

            if (1 <= fathers_age && sons_age <= 80) {
                int years = fathers_age - 2 * sons_age;
                if (years >= 0) {
                    System.out.println("In " + years + " years, the father will be twice as old as the son.");
                } else {
                    System.out.println("It was " + Math.abs(years) + " years ago that the father was twice as old as the son.");
                }
            } else {
                System.out.println("Invalid must be in the range of 1 and 80");
            }
        }
    }