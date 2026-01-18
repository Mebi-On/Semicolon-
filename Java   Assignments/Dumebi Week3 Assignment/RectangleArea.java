import java.util.Scanner;

public class RectangleArea{
    
    public static void main(String [] args){
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rectangle length: "); 
        int num1 = input.nextInt(); 

        System.out.print("Enter rectangle width: ");
        int num2 = input.nextInt(); 

        int area = num1 * num2; 
      
        
        System.out.printf("The area of your rectangel is %d.%n", area);}
        
    } 
} 
