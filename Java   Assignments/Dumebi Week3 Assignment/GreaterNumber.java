import java.util.Scanner;

public class GreaterNumber {
    
    public static void main(String [] args){
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Int: "); 
        int num1 = input.nextInt(); 

        System.out.print("Enter second Int: ");
        int num2 = input.nextInt(); 

        if (num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
            }
        }
    } 
} 
