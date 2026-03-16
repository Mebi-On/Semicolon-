public class fourTriangles {

    public static void main(String[] args) {
        int row = 7; 

        for (int height = 0; height < row; height++) {

            for (int triangleOneWidth = 0; triangleOneWidth <= height; triangleOneWidth ++) {
                System.out.print("*"+ " ");
            }

            for (int triangleOneSpace = 0; triangleOneSpace < row - height; triangleOneSpace++) {
                System.out.print("  ");
            }
	    System.out.print(" ");
z
	    for (int triangleThreeWidth = 0; triangleThreeWidth < row - height; triangleThreeWidth ++) {
                System.out.print("*" + " ");
            }

            for (int triangleThreeSpace = 0; triangleThreeSpace <= height; triangleThreeSpace++) {
                System.out.print("  ");
            }

     
            for (int triangleTwoSpace = 0; triangleTwoSpace < row - 1 - height; triangleTwoSpace ++) {
                System.out.print("  ");
            }
            for (int triangleTwoWidth = 0; triangleTwoWidth <= height; triangleTwoWidth ++) {
                System.out.print("*" + " ");
            }

            System.out.print("  ");

            for (int triangleFourSpace = 0; triangleFourSpace < height; triangleFourSpace ++) {
                System.out.print("  ");
            }
            for (int triangleFourWidth = 0; triangleFourWidth < row - height; triangleFourWidth ++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
