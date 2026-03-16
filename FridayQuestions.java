import java.util.Arrays;

public class FridayQuestions {
    public static int factorial(int number){
        if(number == 0){
            return 1;
        } else {
            for (int index = number - 1; index > 0; index--){
                number *= index;
            }
            return number;
        }
    } 
    public static int combination(int firstInteger, int secondInteger){
        return factorial(firstInteger) / (factorial(secondInteger) * factorial(firstInteger - secondInteger));
    }

    public static String[] evenPostionsString(String string){
        String[] evenPostions = new String[string.length() / 2];
        for (int index = 0; index < string.length(); index++){
            if (index % 2 == 0){
                evenPostions[index / 2] = String.valueOf(string.charAt(index));
            }
        }
        return evenPostions;

    }

    public static String[] arraysOfVowelsAndConsonants(String string){
        String[] vowels = new String[string.length()];
        String[] consonants = new String[string.length()];
        for (int index = 0; index < string.length(); index++){
            
        }
        return new String[]{Arrays.toString(vowels), Arrays.toString(consonants)};
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(combination(5, 2));
        System.out.println(Arrays.toString(evenPostionsString("string")));
        System.out.println(Arrays.toString(arraysOfVowelsAndConsonants("string")));
    }
}
