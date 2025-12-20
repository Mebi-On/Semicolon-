import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your the no of inputs: ");
   
        int inputNumbers = input.nextInt();
  
        int value = input.nextInt();
        int max = value;
        int min = value;
        int count = 1;
   
        while (count <= inputNumbers) {
            value = input.nextInt();
            ++count;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            
        }
        
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
        int sum = max + min;
        System.out.println("The sum is "+ sum);
        input.close();
        }
    }
