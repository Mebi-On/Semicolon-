import java.util.Scanner;

public class DistanceConverter {
    
    public static void main(String [] args){
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in km: "); 
        int num1 = input.nextInt(); 

        double miles = num1 * 0.621371; 
        
        System.out.printf("The distance to %d km is %f miles.%n", num1, miles);}
        
    } 
} 
