
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = StudentGradeUtils.isValidInput(userInput);
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = StudentGradeUtils.isValidInput(userInput);

        int subjectCounter = numberOfSubjects;

        int[][] grades = new int[numberOfStudents][numberOfSubjects];
        float[] averageScore = new float[numberOfStudents];

        for (int rowIndex = 0; rowIndex < grades.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < grades[rowIndex].length; columnIndex++) {
                System.out.println("Enter grades for student " + (rowIndex + 1));
                System.out.print("Enter grades for subject " + (columnIndex + 1) + ": ");

                grades[rowIndex][columnIndex] = StudentGradeUtils.isValidInput(userInput);
                if (grades[rowIndex][columnIndex] < 0 || grades[rowIndex][columnIndex] > 100) {
                    System.out.println("Invalid grade. Grade must be between 0 and 100.");
                    columnIndex--;
                } else {
                    System.out.println("Saves successfully");
                }
            }
            //System.out.println(Arrays.deepToString(grades));
        }
        for (int rowIndex = 0; rowIndex < grades.length; rowIndex++) {
            averageScore[rowIndex] = StudentGradeUtils.calculateAverage(grades, rowIndex);
        }

        int[] position = StudentGradeUtils.positionFind(averageScore);

        System.out.println("============================================================================");
        System.out.print("STUDENT \t");
        for (int noOfSubjects = 0; noOfSubjects < subjectCounter; noOfSubjects++) {
            System.out.print("SUB" + (noOfSubjects + 1) + "\t");
        }
        System.out.print("TOTAL\tAVERAGE\t POS");

        System.out.println("\n============================================================================");

        for (int rowIndex = 0; rowIndex < grades.length; rowIndex++) {
            System.out.print("Student" + (rowIndex + 1));

            for (int columnIndex = 0; columnIndex < grades[rowIndex].length; columnIndex++) {
                System.out.print(" \t " + grades[rowIndex][columnIndex]);
            }

            System.out.printf(
                    "\t%d\t%.2f\t%d%n",
                    StudentGradeUtils.calculateTotal(grades, rowIndex),
                    //calculateAverage(grades, rowIndex),
                    averageScore[rowIndex],
                    position[rowIndex]
            );

            System.out.println();

        }
        System.out.println("\n\nSUBJECT SUMMARY:");
        SubjectSummary summary = StudentGradeUtils.getSubjectSummary(grades);
        
        StudentGradeUtils.getClassSummary(grades, summary);
        userInput.close();
    }
}
