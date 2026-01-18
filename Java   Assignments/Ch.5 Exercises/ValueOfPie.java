public class ValueOfPie {
    public static void main (String[] args) {
        int counter = 0;
        double pie = 4;
        for (int increment = 3; increment <= 1000000; increment += 2){
            if (counter % 2 == 0){
                pie -= 4.0 / increment;
            }
            else{
                pie += 4.0 / increment;
            }
            
            counter ++;

        }
        System.out.printf("%.5f",pie);
    }
}