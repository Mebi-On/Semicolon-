import java.util.Scanner;

public class ageCalc {

    public static void main(String[] args) {
        int i = 20;
        while (i < 100) {
            Scanner input = new Scanner(System.in);

            System.out.print("How old are you?: ");
            int age = input.nextInt();

            int nextAge = age + 1;
            System.out.printf("Next year, you will be %d years old.%n", nextAge);

        }
    }
}
