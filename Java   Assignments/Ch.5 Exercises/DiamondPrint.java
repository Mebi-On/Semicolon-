public class DiamondPrint{
    public static void main (String [] arg){

        int middleNumber = 5;
        int row, space, star;

        for (row = 1; row <= 5; row++){
            for (space = 1; space <= 5 - row; space++){
                System.out.print(" ");
                }
            for( star = 1; star <= row * 2 - 1; star++){
                System.out.print("*");
            }

            System.out.println();
        }
            for (row = 4; row > 0 ; row--){
            for (space = 1; space <= 5 - row; space++){
                System.out.print(" ");
            }
            for( star = 1; star <= row * 2 - 1; star++){
                    System.out.print("*");
                }
             System.out.println();
        }

    }
}
