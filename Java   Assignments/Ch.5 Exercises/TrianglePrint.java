public class TrianglePrint {
    public static void main(String[] args) {

        System.out.println( "A");
// A
        for (int i =1; i < 11; i ++) {
            for (int j =1; j <= i; j ++){
                System.out.printf( "*");
            }
            System.out.println( );
    }
    System.out.println();

        System.out.println( "B");

 //B 

       for (int i = 1; i <= 11; i ++) {
            for (int j =1; j <= 11-i; j ++){
                System.out.print( "*");
            }
            System.out.println( );
        }

//B alternative
//        for (int i = 11; i >= 1; i --) {
//             for (int j =1; j <= i; j ++){
//                 System.out.print( "*" );
//             }
//             System.out.println( );
//         }
//     }
//  }
        System.out.println( "C");

// C
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            for (int k = 10; k >= i; k--) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println( "D");

//D
      for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            for (int k = 10; k >= i; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}