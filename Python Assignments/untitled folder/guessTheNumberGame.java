import java.util.Scanner; 

public class guessTheNumberGame{
    public static void main(String[] args){
        int secretNumber = 7;
        boolean incorrectGuess = true;
        Scanner userInput = new Scanner(System.in);

        while(incorrectGuess){
            System.out.print("Guess!, enter a number: ");
            int userGuess = userInput.nextInt();
            if (userGuess != secretNumber){
                if (userGuess > secretNumber){
                    System.out.println("Too high");
                }
                else{
                    System.out.println("Too low");
                }
            }
            else{
                incorrectGuess = false;
                System.out.println("CORRECT!!");   
            }
        }

    }
}