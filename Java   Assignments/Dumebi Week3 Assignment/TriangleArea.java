import java.util.Scanner;

public class TriangleArea {
    
    public static void main(String [] args){
        int i =20; 

        while (i < 100){ 
        Scanner input = new Scanner(System.in);

        System.out.print("Triangle height: "); 
        int num1 = input.nextInt(); 

        System.out.print("Triangle base length: ");
        int num2 = input.nextInt(); 

        double area = (num1 * num2 * 0.5);
        System.out.println(area);
       
        }
    } 
} 
