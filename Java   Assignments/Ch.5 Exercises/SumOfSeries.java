import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your the no of inputs: ");
   
        int inputNumbers = input.nextInt();
        long sumOfNumbers = 0;
        long productOfNumbers = 1;
  
        if (1 <= inputNumbers && inputNumbers <= 100) {
            for (int numbers = 1; numbers <= inputNumbers; numbers++){
                sumOfNumbers += numbers;
                productOfNumbers *= numbers;
            }
        }
        else{
            System.out.println("Invalid input");
        }
        System.out.println("Number\tSum of Series\t Product of series");
        System.out.printf("%d\t %d \t \t%d", inputNumbers, sumOfNumbers, productOfNumbers);
        System.out.println();
        input.close();
        }
    }
