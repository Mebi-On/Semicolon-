
public class frogGameUtils {

    public static String[][] createBoard(int boardSize) {
        String[][] board = new String[boardSize][boardSize];
        for (int rows = 0; rows < board.length; rows++) {
            for (int column = 0; column < board[rows].length; column++) {
                if (rows == boardSize / 2 && column == boardSize / 2) {
                    board[rows][column] = "F";
                } else {
                    board[rows][column] = "*";
                }
            }
        }
        return board;
    }

    public static void displayBoard(String[][] board) {
        for (int rows = 0; rows < board.length; rows++) {
            for (int column = 0; column < board[rows].length; column++) {
                System.out.print(board[rows][column] + " ");
            }
            System.out.println();
        }
    }

    public static int findFrogRow(String[][] board, int boardSize) {
        int frogRow = 0;
        for (int row = 0; row < boardSize; row++) {
            for (int column = 0; column < boardSize; column++) {
                if (board[row][column].equals("F")) {
                    frogRow = row;
                }
            }
        }
        return frogRow;
    }

    public static int findFrogColumn(String[][] board, int boardSize) {
        int frogColumn = 0;
        for (int row = 0; row < boardSize; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column].equals("F")) {
                    frogColumn = column;
                }
            }
        }
        return frogColumn;
    }

    public static String[][] moveFrog(String[][] board, int boardSize, String direction, int numberOfMoves, int frogRow,
            int frogColumn) {

        for (int moves = 0; moves < numberOfMoves; moves++) {
            switch (direction) {
                case "up":
                    if (frogRow > 0) {
                        board[frogRow][frogColumn] = "*";
                        frogRow--;
                        board[frogRow][frogColumn] = "F";
                    }
                    break;
                case "down":
                    if (frogRow < boardSize - 1)
                        board[frogRow][frogColumn] = "*";
                    frogRow++;
                    board[frogRow][frogColumn] = "F";

                    break;
                case "left":
                    if (frogColumn > 0) {
                        board[frogRow][frogColumn] = "*";
                        frogColumn--;
                        board[frogRow][frogColumn] = "F";
                    }
                    break;
                case "right":
                    if (frogColumn < boardSize - 1) {
                        board[frogRow][frogColumn] = "*";
                        frogColumn++;
                        board[frogRow][frogColumn] = "F";
                    }
                    break;
            }
        }
        return board;
    }

    public static String[][] drawLine(String[][] board, int boardSize, String direction, int numberOfMoves, boolean upOrDown, int frogRow, int frogColumn){
        int lineRow = frogRow;
        int lineColumn = frogColumn;
        if(upOrDown){
            lineRow = frogRow - 1;
        }
        else{
            lineRow = frogRow + 1;
        }
        for(int moves = 0; moves < numberOfMoves - 1; moves++){
            switch(direction){
                case "up":
                    if (lineRow > 0){
                        board[lineRow][lineColumn] = "|";
                        lineRow--;
                    }
                    break;
                case "down":
                    if (lineRow < boardSize - 1){
                            board[lineRow][lineColumn] = "|";
                            lineRow++;
                    }
                    break;
            }
        }
            for( int moves = -1; moves < numberOfMoves; moves++){
                switch(direction){
                    case "left":
                        if (lineColumn > 0){
                            board[lineRow][lineColumn] = "-";
                            lineColumn--;
                        }
                        break;
                    case "right":
                        if (lineColumn < boardSize - 1){
                            board[lineRow][lineColumn] = "-";
                            lineColumn++;
                        }
                        break;
                    }
                }
        
        return board;
    }

}