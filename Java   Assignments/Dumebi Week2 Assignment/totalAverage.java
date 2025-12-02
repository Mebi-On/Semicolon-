import java.util.Scanner;

public class totalAverage{
    
    public static void main(String [] args){
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Int: "); 
        int num1 = input.nextInt(); 

        System.out.print("Enter second Int: ");
        int num2 = input.nextInt(); 

        System.out.print("Enter third Int: ");
        int num3 = input.nextInt(); 

        int total = num1 + num2 + num3; 
        float avg = total / 3f;
        
        System.out.printf("The total is %d and the average is %.2f.%n", total, avg);}
        
    } 
} 
