import java.util.Scanner;

public class multipleLetters{
	public static void main (String[] args){
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter a word: ");
        	String user_word = userInput.next();
        	System.out.print("Enter a number: ");
        	int user_number = userInput.nextInt();
		System.out.println(multiplyLetters(user_word, user_number));
	}



public static String multiplyLetters(String user_word, int user_numbers){
	String result = ""; 
		
		for (int letterIndex = 0; letterIndex < user_word.length(); letterIndex++){
			for (int num = 0; num < user_numbers; num ++){
				result += user_word.charAt(letterIndex);
			}
		}
        	return result;
	}
}