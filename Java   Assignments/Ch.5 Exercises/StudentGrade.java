import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        String [] names = new String [5];
        char [] grades = new char [5];
        
        for (int students = 0; students < 5; students++){

            System.out.print("Enter students " + (students +1) + " name: "); 
            names[students] = userInput.next();

            System.out.print("Enter students " + (students +1) + " grade: ");
            grades[students] = userInput.next().toUpperCase().charAt(0);

            System.out.println();
        }
        //System.out.print(Arrays.toString(names));
        //System.out.print(Arrays.toString(grades));
        System.out.println("Student Grades");
        for (int index = 0; index < 5; index ++){
            System.out.println(names[index] + ": "+ grades[index]);
        }
    }
}