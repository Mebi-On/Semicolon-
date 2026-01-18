import java.util.Scanner;

public class readaySetGo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 20;
        while (i < 100) {
            System.out.print("Enter a color: ");
            String color = input.next();

            if (color.equals("Red")){
                System.out.println("Stop");
            }
            else if ("Yellow".equals(color)){
                System.out.println("Set");
            }
            else if ("Green".equals(color)){
                System.out.println("Go");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
