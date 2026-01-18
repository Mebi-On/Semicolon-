import java.util.Scanner;

public class leapYearFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 20;
        while (i < 100) {
            System.out.print("Enter year: ");
            int year = input.nextInt();

            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " not a leap year");
                }
            }
        }
    }
}