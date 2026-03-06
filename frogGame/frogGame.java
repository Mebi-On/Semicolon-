import java.util.Random;
import java.util.Scanner;

public class frogGame {
    public static void main(String... args){
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the board size: ");
        int boardSize = userInput.nextInt();
        boolean upOrDown = random.nextBoolean(); //Whether the pen is up or down, true is up and false is down
        System.out.println("Whether the pen is up or down, true is up and false is down: " + upOrDown);
        
        String[][] board = frogGameUtils.createBoard(boardSize);
        frogGameUtils.displayBoard(board);

        int counter = 0;   
        while(counter < 5){
            System.out.print("Enter the direction of the frog (up, down, left, right): ");
            String direction = userInput.next().toLowerCase();
            System.out.print("Enter the number of moves: ");
            int numberOfMoves = userInput.nextInt();

            System.out.println();
            int frogRow = frogGameUtils.findFrogRow(board, boardSize);
            int frogColumn = frogGameUtils.findFrogColumn(board, boardSize);
            board = frogGameUtils.moveFrog(board, boardSize, direction, numberOfMoves, frogRow, frogColumn);
            board = frogGameUtils.drawLine(board, boardSize, direction, numberOfMoves, upOrDown, frogRow, frogColumn);
            frogGameUtils.displayBoard(board);
            counter++;
        }
    }
}
