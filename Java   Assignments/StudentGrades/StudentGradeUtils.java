public class StudentGradeUtils {

    public static float calculateStudentAverage(int[][] grades, int students) {
        float averageOfGrades = 0;

        for (int subjects = 0; subjects < grades[students].length; subjects++) {
            averageOfGrades += grades[students][subjects];
        }
        return averageOfGrades / grades[students].length;
    }

    public static int calculateStudentTotal(int[][] grades, int students) {
        int sumOfGrades = 0;
        for (int subjects = 0; subjects < grades[students].length; subjects++) {
            sumOfGrades += grades[students][subjects];
        }
        return sumOfGrades;
    }

    public static int calculateClassTotal(int[][] grades) {

        int classTotal = 0;

        for (int student = 0; student < grades.length; student++) {
            for (int subject = 0; subject < grades[0].length; subject++) {
                classTotal += grades[student][subject];
            }
        }
        return classTotal;
    }

}
