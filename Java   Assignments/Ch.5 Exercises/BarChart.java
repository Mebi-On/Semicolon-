import java.util.Scanner;

public class BarChart {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numbers = new int[5];
  
        for (int inputNumber = 0; inputNumber < 5; inputNumber++){

            System.out.print("Enter your the no of inputs: ");
            int nums = input.nextInt();
            
            if (1 <= nums && nums <= 30){
                numbers[inputNumber] = nums;
            }
            else{
                System.out.println("Invalid input");
                inputNumber--;
            }
        }
        System.out.println();
        for (int num: numbers){
            for (int stars = 1; stars <= num; stars++){
                System.out.print("*");
            }
        System.out.println();
        }
        input.close();
    }
}
