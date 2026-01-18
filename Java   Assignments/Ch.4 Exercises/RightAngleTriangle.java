import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {

        System.out.print("Enter the length of the triangle: ");
        Scanner userInput = new Scanner(System.in);
        int triangleLength = userInput.nextInt();
        for (int i =1; i < triangleLength + 1; i ++) {
            for (int j =1; j <= i; j ++){
                System.out.printf( "*");
            }
            userInput.close();
        }
    }
}