
public class CheckerboardPattern{
    public static void main (String [] args){
        int size = 8;
        for (int row = 0; row < size; row ++){
            for (int col = 0; col < 2 * size; col ++){
                if ((row + col) % 2 == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}