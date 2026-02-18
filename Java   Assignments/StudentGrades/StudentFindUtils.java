
public class StudentFindUtils {

    public static int[] findStudentPosition(float[] averageScore) {
        int[] position = new int[averageScore.length];

        for (int firstStudent = 0; firstStudent < averageScore.length; firstStudent++) {
            int currentPosition = 1;
            for (int secondStudent = 0; secondStudent < averageScore.length; secondStudent++) {
                if (averageScore[secondNumber] > averageScore[firstNumber]) {
                    currentPosition++;
                }
            }
            position[firstStudent] = currentPosition;
        }
        return position;
    }

    public static int[] findHardestAndEasiestSubject(SubjectSummary summary) {
        int hardest = 0, easiest = 0;
        int lowestScore = summary.subjectTotal[0];
        int highestScore = summary.subjectTotal[0];
        int maxFails = summary.fails[0];
        int maxPasses = summary.passes[0];

        for (int index = 1; index < summary.fails.length; index++) {
            if (summary.fails[index] > maxFails) {
                maxFails = summary.fails[index];
                hardest = index;
            }
            if (summary.subjectTotal[index] < lowestScore) {
                lowestScore = summary.subjectTotal[index];
                hardest = index;
            }

            if (summary.passes[index] > maxPasses) {
                maxPasses = summary.passes[index];
                easiest = index;
            }
            if (summary.subjectTotal[index] > highestScore) {
                highestScore = summary.subjectTotal[index];
                easiest = index;
            }
        }
        return new int[]{hardest, easiest, maxFails, maxPasses};
    }

    public static int[] findBestAndWorstStudent(int[][] grades) {
        int bestStudent = 0;
        int worstStudent = 0;
        int[] studentTotals = new int[grades.length];

        for (int students = 0; students < grades.length; students++) {
            for (int subjects = 0; subjects < grades[0].length; subjects++) {
                studentTotals[students] += grades[students][subjects];
            }
            if (studentTotals[students] > studentTotals[bestStudent]) {
                bestStudent = students;
            }
            if (studentTotals[students] < studentTotals[worstStudent]) {
                worstStudent = students;
            }
        }
        return new int[]{bestStudent, studentTotals[bestStudent], worstStudent, studentTotals[worstStudent]};
    }

    public static int[] findOverallHighestAndLowest(int[][] grades) {
        int overallHighest = 0;
        int overallHighestStudent = 0;
        int overallHighestSubject = 0;
        int overallLowest = 100;
        int overallLowestStudent = 0;
        int overallLowestSubject = 0;

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
        return new int[]{overallHighest, overallHighestStudent, overallHighestSubject, overallLowest, overallLowestStudent, overallLowestSubject};
    }

}
