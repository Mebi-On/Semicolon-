import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = userInput.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = userInput.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = userInput.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = userInput.nextDouble();

        if (x1 == x2) {
            System.out.println("The points lie on a line perpendicular to the x-axis.");
        } 
        else if (y1 == y2) {
            System.out.println("The points lie on a line perpendicular to the y-axis.");
        } 
        else {
            System.out.println("The points do not lie on a line perpendicular to any axis.");
        }
    }
}
