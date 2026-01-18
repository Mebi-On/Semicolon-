import java.util.Scanner;

public class GasMileage{
    public static void main (String[] args){
        int contineProgram = 0;
        double total = 0;
        

        while(contineProgram != -1){
            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter miles traveled: ");
            int miles = userInput.nextInt();
            
            System.out.println("Enter miles traveled: ");
            int gallon = userInput.nextInt();

            float mileCalc = miles;
            float gallonCalc = gallon;
            float milesPerGallon = mileCalc / gallonCalc;
            System.out.println(milesPerGallon);
            total += milesPerGallon;

            System.out.println("continue? (yes/no)");
            String continueProgramString = userInput.next().toLowerCase();
            
            if (continueProgramString.equals("no")){
                contineProgram = -1;
                System.out.println("Total is " + total);
            }

            else if (continueProgramString.equals("yes") ){
                
            }

            else{
                System.out.println("Invalid input");
                break;
            }
        }
        // scanner close;

    }
}