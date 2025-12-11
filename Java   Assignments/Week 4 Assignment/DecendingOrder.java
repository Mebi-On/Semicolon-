
import java.util.Arrays;


public class DecendingOrder{

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double [] nums = {num1, num2, num3};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}