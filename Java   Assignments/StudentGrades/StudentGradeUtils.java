import java.util.Scanner;

public class StudentGradeUtils {

    public static int isValidInput(Scanner userInput) {
        boolean isValid = true;
        while (isValid) { 
            if (userInput.hasNextInt()) {
                int value = userInput.nextInt();

                if (value > 0) {
                    return value;
                } else {
                    System.out.print("Input must not be less than 0. Enter a positive integer: ");
                }
            } else {
                System.out.print("Invalid input. Enter an integer: ");
                userInput.next();
            }
        }
        return 0;
    }

    public static float calculateAverage(int[][] grades, int rowIndex) {
        float sumOfGrades = 0;

        for (int columnIndex = 0; columnIndex < grades[rowIndex].length; columnIndex++) {
            sumOfGrades += grades[rowIndex][columnIndex];
        }
        return sumOfGrades / grades[rowIndex].length;
    }

    public static int calculateTotal(int[][] grades, int rowIndex) {
        int sumOfGrades = 0;
        for (int columnIndex = 0; columnIndex < grades[rowIndex].length; columnIndex++) {
            sumOfGrades += grades[rowIndex][columnIndex];
        }
        return sumOfGrades;
    }

    public static int[] positionFind(float[] averageScore) {
        int[] position = new int[averageScore.length];

        for (int firstNumber = 0; firstNumber < averageScore.length; firstNumber++) {
            int currentPosition = 1;
            for (int secondNumber = 0; secondNumber < averageScore.length; secondNumber++) {
                if (averageScore[secondNumber] > averageScore[firstNumber]) {
                    currentPosition++;
                }
            }
            position[firstNumber] = currentPosition;
        }
        return position;
    }

    public static SubjectSummary getSubjectSummary(int[][] grades) {
        int subjects = grades[0].length;
        int students = grades.length;
        SubjectSummary summary = new SubjectSummary(subjects);

        for (int subject = 0; subject < subjects; subject++) {
            int totalGrade = 0;
            int highestGrade = 0;
            int highestStudent = 0;
            int lowestGrade = 100;
            int lowestStudent = 0;
            int passes = 0;
            int fails = 0;

            System.out.println("Subject " + (subject + 1));
            for (int student = 0; student < students; student++) {
                totalGrade += grades[student][subject];

                if (grades[student][subject] > highestGrade) {
                    highestGrade = grades[student][subject];
                    highestStudent = student;
                }

                if (grades[student][subject] < lowestGrade) {
                    lowestGrade = grades[student][subject];
                    lowestStudent = student;
                }
                
                if (grades[student][subject] >= 50) {
                    passes++;
                } else {
                    fails++;
                }

            }

            summary.subjectTotal[subject] = totalGrade;
            summary.averageGrade[subject] = (float) totalGrade / subjects;
            summary.highestGrade[subject] = highestGrade;
            summary.highestStudent[subject] = highestStudent;
            summary.lowestGrade[subject] = lowestGrade;
            summary.lowestStudent[subject] = lowestStudent;
            summary.passes[subject] = passes;
            summary.fails[subject] = fails;

            System.out.printf("""
                Highest scoring student is: Student %d scoring %d
                Lowest scoring student is: Student %d scoring %d
                Total Score is: %d
                Average Grade: %.2f
                Number of Passes: %d
                Number of Fails: %d
                
                """,
                (highestStudent + 1),
                highestGrade,
                (lowestStudent + 1),
                lowestGrade,
                totalGrade,
                summary.averageGrade[subject],
                passes,
                fails
            );
        }
        return summary;
    }

    public static void getClassSummary(int[][] grades, SubjectSummary summary) {

    int hardest = 0, easiest = 0;
    int maxFails = summary.fails[0];
    int maxPasses = summary.passes[0];

    for (int index = 1; index < summary.fails.length; index++) {
        if (summary.fails[index] > maxFails) {
            maxFails = summary.fails[index];
            hardest = index;
        }
        if (summary.passes[index] > maxPasses) {
            maxPasses = summary.passes[index];
            easiest = index;
        }
    }

    int bestStudent = 0, worstStudent = 0;
    int[] studentTotals = new int[grades.length];

    for (int students = 0; students < grades.length; students++) {
        for (int subjects = 0; subjects < grades[0].length; subjects++) {
            studentTotals[students] += grades[students][subjects];
        }
        if (studentTotals[students] > studentTotals[bestStudent]) bestStudent = students;
        if (studentTotals[students] < studentTotals[worstStudent]) worstStudent = students;
    }

    int overallHighest = 0, overallHighestStudent = 0, overallHighestSubject = 0;
    int overallLowest = 100, overallLowestStudent = 0, overallLowestSubject = 0;
    
    for (int student = 0; student < grades.length; student++) {
        for (int subject = 0; subject < grades[0].length; subject++) {
            if (grades[student][subject] > overallHighest) {
                overallHighest = grades[student][subject];
                overallHighestStudent = student;
                overallHighestSubject = subject;
            }
            if (grades[student][subject] < overallLowest) {
                overallLowest = grades[student][subject];
                overallLowestStudent = student;
                overallLowestSubject = subject;
            }
        }
    }

    int classTotal = 0;
    for (int students : studentTotals) classTotal += students;

    System.out.println("The hardest subject is Subject " + (hardest + 1) + " with " + maxFails + " failures");
    System.out.println("The easiest subject is Subject " + (easiest + 1) + " with " + maxPasses + " passes");
    System.out.printf("The overall highest score is scored by Student %d in Subject %d scoring %d%n",
                     (overallHighestStudent + 1),
                     (overallHighestSubject + 1),
                     overallHighest);
    System.out.printf("The overall lowest score is scored by Student %d in Subject %d scoring %d%n",
                     (overallLowestStudent + 1),
                     (overallLowestSubject + 1),
                     overallLowest);

    System.out.println("=================================");
    System.out.println("\nCLASS SUMMARY");
    System.out.println("=================================");

    System.out.println("Best Graduating Student is: Student " + (bestStudent + 1) + " scoring " + studentTotals[bestStudent]);
    System.out.println("Worst Graduating Student is: Student " + (worstStudent + 1) + " scoring " + studentTotals[worstStudent]);

    System.out.println("=================================");
    System.out.println("\nClass total score is: " + classTotal);
    System.out.printf("Class Average score is: %.2f%n", (float) classTotal / grades.length);
}
}