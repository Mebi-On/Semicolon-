import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = InputValidator.isValidInput(userInput);
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = InputValidator.isValidInput(userInput);

        int[][] grades = new int[numberOfStudents][numberOfSubjects];

        for (int rowIndex = 0; rowIndex < grades.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < grades[rowIndex].length; columnIndex++) {
                System.out.println("Enter grades for student " + (rowIndex + 1));
                System.out.print("Enter grades for subject " + (columnIndex + 1) + ": ");

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
        System.out.print("STUDENT \t");
        for (int noOfSubjects = 0; noOfSubjects < numberOfSubjects; noOfSubjects++) {
            System.out.print("SUB" + (noOfSubjects + 1) + "\t");
        }
        System.out.print("TOTAL\tAVERAGE\t POS");
        System.out.println("\n============================================================================");

        StudentReportUtils.getStudentSummary(grades);

        System.out.println();

        System.out.println("\n\nSUBJECT SUMMARY:");
        SubjectSummary summary = StudentReportUtils.getSubjectSummary(grades);

        StudentReportUtils.getClassSummary(grades, summary);
        userInput.close();
    }
}
