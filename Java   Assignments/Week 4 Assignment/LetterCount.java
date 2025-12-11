
public class LetterCount{

    public static int countLetters(String s){
        int numberOfLetters = 0;
        for (int letterCount = 0; letterCount < s.length(); letterCount++) {
            char characters = s.charAt(letterCount);
            if (Character.isLetter(characters)) {
                numberOfLetters++;
            }
        }
        return numberOfLetters;
       
    }
}
