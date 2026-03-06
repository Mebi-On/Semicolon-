import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = InputValidator.isValidInput(userInput);
        String [] studentNames = new String [numberOfStudents];
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = InputValidator.isValidInput(userInput);
        String [] subjectNames = new String [numberOfSubjects];
        
        for (int index = 0; index < numberOfStudents; index++){
            System.out.print("Enter students name: ");
            String studentNameInput = userInput.next();
            //userInput.nextLine();
            studentNames[index] = studentNameInput;
        }


        for (int index = 0; index < numberOfSubjects; index++){
            System.out.print("Enter subject name: ");
            String subjectNameInput = userInput.next();
            subjectNames[index] = subjectNameInput;
        }

        int[][] grades = new int[numberOfStudents][numberOfSubjects];

        for (int rowIndex = 0; rowIndex < grades.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < grades[rowIndex].length; columnIndex++) {
                System.out.println("Enter grades for " + studentNames[rowIndex]);
                System.out.print("Enter grades for " + subjectNames[columnIndex] + ": ");

                grades[rowIndex][columnIndex] = InputValidator.isValidInput(userInput);
                if (grades[rowIndex][columnIndex] < 0 || grades[rowIndex][columnIndex] > 100) {
                    System.out.println("Invalid grade. Grade must be between 0 and 100.");
                    columnIndex--;
                } else {
                    System.out.println("Saves successfully");
                }
            }
            //System.out.println(Arrays.deepToString(grades));
        }

        System.out.println("============================================================================");
        System.out.print("STUDENT\t");
        for (int noOfSubjects = 0; noOfSubjects < numberOfSubjects; noOfSubjects++) {
            System.out.print( subjectNames[noOfSubjects].toUpperCase() + "\t");
        }
        System.out.print("TOTAL\tAVERAGE\tPOS");
        System.out.println("\n============================================================================");

        SubjectSummary.getStudentSummary(grades, studentNames);

        System.out.println();

        System.out.println("\n\nSUBJECT SUMMARY:");
        SubjectSummary summary = SubjectSummary.getSubjectSummary(grades, subjectNames, studentNames);

        SubjectSummary.getClassSummary(grades, summary, subjectNames, studentNames);
        userInput.close();
    }
}
