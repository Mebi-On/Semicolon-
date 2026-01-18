import java.util.Scanner;

public class TimeSeconds {
    public static void main(String[] args) {
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of seconds: ");
        int Seconds = input.nextInt();

        int hours = Seconds / 3600;
        int minutes = (Seconds % 3600) / 60;
        int seconds = Seconds % 60;

        System.out.printf("Time %d:%d:%d.\n", hours, minutes, seconds);
        }
    }
}
