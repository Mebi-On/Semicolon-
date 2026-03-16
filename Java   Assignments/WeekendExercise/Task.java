import java.util.*;

public class Task {
    
    public static void reverseString(String userInput) {
        char[] letters = userInput.toCharArray();
        for (int index = letters.length - 1; index >= 0; index--) {
            System.out.print(letters[index]);
        }
        System.out.println();
    }

    public static void reverseInteger(String userInput) {
        char[] digits = userInput.toCharArray();
        for (int index = digits.length - 1; index >= 0; index--) {
            System.out.print(digits[index]);
        }
        System.out.println();
    }

    public static void uppercaseCount(String userInput) {
        int count = 0;
        for (char letters : userInput.toCharArray()) {
            if (Character.isUpperCase(letters)) count++;
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public static void lowercaseCount(String userInput) {
        int count = 0;
        for (char letters : userInput.toCharArray()) {
            if (Character.isLowerCase(letters)) count++;
        }
        System.out.println("Number of lowercase letters: " + count);
    }

    public static void firstVowelPosition(String userInput) {
        String vowels = "aeiou";
        char[] listOfLetters = userInput.toLowerCase().toCharArray();
        for (int index = 0; index < listOfLetters.length; index++) {
            if (vowels.contains(listOfLetters[index] + "")) {
                System.out.println("The position of the first vowel in the string is " + (index + 1));
                break;
            }
        }
    }

    public static void avgOneToHundred() {
        int sum = 0;
        for (int number = 1; number <= 100; number++){
            sum += number;
        } 
        System.out.println("Average of numbers from 1 to 100 = " + (sum / 100.0));
    }

    public static void divisors(int userInput) {
        int count = 0;
        System.out.print("Divisors: ");
        for (int index = 1; index <= userInput; index++) {
            if (userInput % index == 0) {
                System.out.print(index + ", ");
                count++;
            }
        }
        System.out.println("\nNumber of divisors = " + count);
    }

    public static void power(int number, int exp) {
        int result = 1;
        for (int index = 0; index < exp; index++) {
            result *= number;
        }
        System.out.println(result);
    }
    
    public static void palindromeNumber(String userInput) {
        char[] listOfDigits = userInput.toCharArray();
        char[] reversedList = new char[listOfDigits.length];
        
        for (int index = 0; index < listOfDigits.length; index++) {
            reversedList[index] = listOfDigits[listOfDigits.length - 1 - index];
        }
        
        if (Arrays.equals(listOfDigits, reversedList)) {
                System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
    
    public static void palindromeString(String userInput) {
        char[] listOfLetters = userInput.toCharArray();
        char[] reversedList = new char[listOfLetters.length];
        
        for (int index = 0; index < listOfLetters.length; index++) {
            reversedList[index] = listOfLetters[listOfLetters.length - 1 - index];
        }
        
        if (Arrays.equals(listOfLetters, reversedList)) {
                System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }

    public static void numberOfWords(String userInput) {
        int numberOfWords = 1;
        for (int index = 0; index < userInput.length(); index++) {
            if (userInput.charAt(index) == ' ') {
                numberOfWords++;
            }
        }
        System.out.println(numberOfWords);
    }

    public static void sumOfEvenDigits(String userInput) {
        int sumOfEven = 0;
        int digit;
        System.out.println("HERE");
        for (int index = 0; index < userInput.length(); index++) {
            digit = (userInput.charAt(index) - '0') ;
            if (digit % 2 == 0) {
                sumOfEven += digit;
            }
        }
        System.out.println("Sum of all even digits is = " + sumOfEven);
    }//Fix, Starts at 48
    
    public static void sumOfOddDigits(String userInput) {
        int sumOfOdd = 0;
        for (int index = 0; index < userInput.length(); index++) {
            int digit = userInput.charAt(index) - '0';
            if (digit % 2 != 0) {
                sumOfOdd += digit ;
            }
        }
        System.out.println("Sum of all odd digits is = " + sumOfOdd);
    }//Fix, Starts at 48

    static void primeNumbers() {
        int count = 0;
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            for (int index = 2; index < number; index++) {
                if (number % index == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
        }
        System.out.println("\nTotal primes = " + count);
    }

    static void fibonacciSequence() {
        int firtsNumber = 1, secondNumber = 1;
        for (int index = 0; index < 20; index++) {
            System.out.print(firtsNumber + " ");
            int temp = secondNumber;
            secondNumber = firtsNumber + secondNumber;
            firtsNumber = temp;
        }
        System.out.println();
    }

    static void binaryToDecimal(String userInput) {
        int decimal = 0;
        int power = 0;
        for (int index = userInput.length() - 1; index >= 0; index--) {
            decimal += (userInput.charAt(index) - '0') * Math.pow(2, power++);
        }
        System.out.println("Decimal value = " + decimal);
    }

    static void decimalToBinary(int userInput) {
        String binary = "";
        while (userInput > 0) {
            binary = (userInput % 2) + binary;
            userInput /= 2;
        }
        System.out.println("Binary value = " + binary);
    }

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = userInputScanner.nextLine();
        reverseString(userInput);
        
        System.out.print("Enter a integer: ");
        userInput = userInputScanner.nextLine();
        reverseInteger(userInput);
        
        System.out.print("Enter a string: ");
        userInput = userInputScanner.nextLine();
        userInput = userInput.replace(" ", "");
        uppercaseCount(userInput);
        lowercaseCount(userInput);
        firstVowelPosition(userInput);
      
        
        avgOneToHundred();
        
        System.out.print("Enter a number to check palindrome: ");
        userInput = userInputScanner.nextLine();
        palindromeNumber(userInput);
        
        System.out.print("Enter a string to check palindrome: ");
        userInput = userInputScanner.nextLine();
        palindromeString(userInput);
        
        System.out.print("Enter a integer: ");
        int numInput = userInputScanner.nextInt();
        divisors(numInput);
        
        System.out.print("Enter a number: ");
        int number = userInputScanner.nextInt();
        System.out.print("Enter the power raised to: ");
        int exp = userInputScanner.nextInt();
        power(number, exp);
        userInputScanner.nextLine();
        
        System.out.print("Enter a sentence: ");
        userInput = userInputScanner.nextLine();
        numberOfWords(userInput);
        
        System.out.print("Enter a integer: ");
        userInput = userInputScanner.nextLine();
        sumOfEvenDigits(userInput);
        sumOfOddDigits(userInput);
        
        primeNumbers();
        
        fibonacciSequence();
        
        System.out.print("Enter a binary number: ");
        userInput = userInputScanner.nextLine();
        binaryToDecimal(userInput);
        
        System.out.print("Enter a decimal number: ");
        numInput = userInputScanner.nextInt();
        decimalToBinary(numInput);

    }
}