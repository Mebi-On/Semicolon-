public class IntegerDivisibleByThree{
    public static void main (String [] args){
        int sumOfNumbers = 0;

        for (int numbers = 0; numbers <= 30; numbers++){
            if (numbers % 3 == 0){
                sumOfNumbers += numbers;
            }
        }
        System.out.println("The sum of all ints divisible by 3 between 1 and 30 is: " + sumOfNumbers);
    }
}